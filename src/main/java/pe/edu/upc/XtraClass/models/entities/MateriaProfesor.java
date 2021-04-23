package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Materia_Profesor")
public class MateriaProfesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Docente_ID",nullable = false)
	private Integer DocenteID;
	
	@Column(name = "materia_ID",nullable = false)
	private Integer materiaID;
}
