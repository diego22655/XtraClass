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
@Table(name = "Reserva_Clase")
public class ReservaClase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservacion_id")
	private Integer id;
	
	@Column(name = "horaInicio", nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horaInicio; 
	
	@Column(name = "horaFin", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date horaFin;
	
	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private Alumno alumno;
	
	private Docente docente;
	
	private CalificacionDocente calificacion;
}
