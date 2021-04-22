package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Calificacion_Docente")
public class CalificacionDocente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Calificacion_ID")
	private Integer id;

	@Column(name = "last_name", length = 10)
	private String nombreCalificacion;
}
