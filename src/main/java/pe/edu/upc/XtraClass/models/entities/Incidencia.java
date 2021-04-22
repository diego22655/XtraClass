package pe.edu.upc.XtraClass.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "incidencias")
public class Incidencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "incidencia_id")
	private Integer id;
	
	@Column(name = "descripcion", length = 120, nullable = false)
	private String descripcion;
	
	@Column(name = "problema", length = 120, nullable = false)
	private String problema;
	
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	
	private Alumno alumno;
	
	private Asunto asunto;

}
