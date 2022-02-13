
package com.ibm.academia.restapi.universidad.modelo.entidades;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "empleados", schema = "universidad")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Empleado extends Persona {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -292308737458990048L;

	@Column(name = "sueldo")
	private BigDecimal sueldo;
	
	@Column(name = "tipo_empleado")
	@Enumerated(EnumType.STRING)
	private TipoEmpleado tipoEmpleado;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "pabellon_id", foreignKey = @ForeignKey(name = "FK_PABELLON_ID"))
	private Pabellon pabellon;
	

    public Empleado(BigDecimal sueldo, TipoEmpleado tipoEmpleado, Long id, String nombre, String apellido, String dni, String usuarioCreacion, Direccion direccion) {
        super(id, nombre, apellido, dni, usuarioCreacion, direccion);
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("sueldo=").append(sueldo);
        sb.append(", tipoEmpleado=").append(tipoEmpleado);
        sb.append('}');
        return sb.toString();
    }
        

    
}
