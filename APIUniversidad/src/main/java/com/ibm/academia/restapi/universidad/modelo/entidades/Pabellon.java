package com.ibm.academia.restapi.universidad.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pabellones", schema = "universidad")
public class Pabellon implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6834471235531737646L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "metros_cuadrados")
	private Double metrosCuadrados;
	
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal")),
		@AttributeOverride(name =  "departamento", column = @Column(name = "departamento"))
	})
	private Direccion direccion;
	
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@OneToMany(mappedBy = "pabellon", fetch = FetchType.LAZY)
	private Set<Aula> aulas;

    public Pabellon(Long id, Double metrosCuadrados, String nombre, Direccion direccion, String usuarioCreacion) {
        this.id = id;
        this.metrosCuadrados = metrosCuadrados;
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public String toString() {
        return "Pabellon{" + "id=" + id + ", metrosCuadrados=" + metrosCuadrados + ", nombre=" + nombre + ", direccion=" + direccion + ", usuarioCreacion=" + usuarioCreacion + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pabellon other = (Pabellon) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
}