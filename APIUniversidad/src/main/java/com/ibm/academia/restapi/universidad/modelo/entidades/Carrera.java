
package com.ibm.academia.restapi.universidad.modelo.entidades;

import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "carreras", schema = "universidad")
public class Carrera {
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, unique = true, length = 80)
	private String nombre;
	
	@Column(name = "cantidad_materias")
	private Integer cantidadMaterias;
	
	@Column(name = "cantidad_anios")
	private Integer cantidadAnios;
	
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
	private Set<Alumno> alumnos;
	
	@ManyToMany(mappedBy = "carreras", fetch = FetchType.LAZY)
	private Set<Profesor> profesores;
	

    public Carrera(Long id, String nombre, Integer cantidadMaterias, Integer cantidadAnios, String usuarioCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadMaterias = cantidadMaterias;
        this.cantidadAnios = cantidadAnios;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrera{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", cantidadMaterias=").append(cantidadMaterias);
        sb.append(", cantidadAnios=").append(cantidadAnios);
        sb.append(", usuarioCreacion=").append(usuarioCreacion);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaModificacion=").append(fechaModificacion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nombre);
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
        final Carrera other = (Carrera) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
}
