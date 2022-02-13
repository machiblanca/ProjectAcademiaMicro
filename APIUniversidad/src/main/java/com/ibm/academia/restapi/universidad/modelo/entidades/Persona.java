/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibm.academia.restapi.universidad.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "personas", schema = "universidad")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -3484886170054318645L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 60)
	private String apellido;
	
	@Column(name = "dni", nullable = false, unique = true, length = 10)
	private String dni;
	
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal")),
		@AttributeOverride(name =  "departamento", column = @Column(name = "departamento"))
	})
	private Direccion direccion;
	

    public Persona(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.usuarioCreacion = usuarioCreacion;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", dni=").append(dni);
        sb.append(", usuarioCreacion=").append(usuarioCreacion);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaModificacion=").append(fechaModificacion);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.id, other.id);
    }

   
        
   
}
