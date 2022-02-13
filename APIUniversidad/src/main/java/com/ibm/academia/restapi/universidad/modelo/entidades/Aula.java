
package com.ibm.academia.restapi.universidad.modelo.entidades;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "aulas", schema = "universidad")
public class Aula implements Serializable
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 8829980871736139561L;

@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_aula", nullable = false, length = 5)
	private Integer numeroAula;
	
	@Column(name = "medidas")
	private String medidas;
	
	@Column(name = "cantidad_pupitres")
	private Integer cantidadPupitres;
	
	@Column(name = "tipo_pizarron")
	@Enumerated(EnumType.STRING)
	private TipoPizarron tipoPizarron;
	
	@Column(name = "usuario_creacion", nullable = false)
	private String usuarioCreacion;
	
	@Column(name = "fecha_creacion", nullable = false)
	private Date fechaCreacion;
	
	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;
	
	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "pabellon_id", foreignKey = @ForeignKey(name = "FK_PABELLON_ID"))
	private Pabellon pabellon;

    public Aula(Long id, Integer numeroAula, String medidas, Integer cantidadPupitres, TipoPizarron tipoPizarron, String usuarioCreacion) {
        this.id = id;
        this.numeroAula = numeroAula;
        this.medidas = medidas;
        this.cantidadPupitres = cantidadPupitres;
        this.tipoPizarron = tipoPizarron;
        this.usuarioCreacion = usuarioCreacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aula{");
        sb.append("id=").append(id);
        sb.append(", numeroAula=").append(numeroAula);
        sb.append(", medidas=").append(medidas);
        sb.append(", cantidadPupitres=").append(cantidadPupitres);
        sb.append(", tipoPizarron=").append(tipoPizarron);
        sb.append(", usuarioCreacion=").append(usuarioCreacion);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaModificacion=").append(fechaModificacion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.numeroAula);
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
        final Aula other = (Aula) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.numeroAula, other.numeroAula);
    }
    
    
}
