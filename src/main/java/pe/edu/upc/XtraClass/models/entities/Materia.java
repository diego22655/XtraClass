package pe.edu.upc.XtraClass.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "Materias")	
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "materia_id")
	private Integer id;
	
	@Column(name = "country_name", length = 20)
	private String nombre;

	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
	private List<MateriaProfesor> MateriaProfesores;
}
