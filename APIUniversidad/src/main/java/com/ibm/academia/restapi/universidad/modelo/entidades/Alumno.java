
package com.ibm.academia.restapi.universidad.modelo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "alumnos", schema = "universidad")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona
{
/**
	 * 
	 */
	private static final long serialVersionUID = -3312425021202297575L;
@ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinColumn(name = "carrera_id", foreignKey = @ForeignKey(name = "FK_CARRERA_ID"))
	private Carrera carrera;
	
	public Alumno(Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion) 
	{
		super(id, nombre, apellido, dni, usuarioCreacion, direccion);
	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("Alumno []");
        return sb.toString();
    }

    
}
