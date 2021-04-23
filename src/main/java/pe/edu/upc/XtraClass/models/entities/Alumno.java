package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Alumno_ID",nullable = false)
	private Integer id;
	
	private Tarjeta tarjeta;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
}
