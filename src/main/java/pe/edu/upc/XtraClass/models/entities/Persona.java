package pe.edu.upc.XtraClass.models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personas")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "persona_id")
	private Integer id;
	
	@Column(name = "nombre", length = 20, nullable = false)
	private String nombre;
	
	@Column(name = "apellido", length = 20, nullable = false)
	private String apellido;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "contraseña", length = 12, nullable = false)
	private String contraseña;
	
	@Column(name = "nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date nacimiento;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Alumno> alumnos;

	@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
	private List<Docente> docentes;
}
