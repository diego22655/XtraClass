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
@Table(name = "tarjetas")
public class Tarjeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tarjeta_id")
	private Integer id;
	
	@Column(name = "nro_Tarjeta", length = 16, nullable = false)
	private String nroTarjeta;
	
	@Column(name = "propietario", length = 40, nullable = false)
	private String propietario;
	
	@Column(name = "ccv", columnDefinition = "NUMERIC(3)")
	private Integer ccv;
	
	@OneToMany(mappedBy="tarjeta",fetch= FetchType.LAZY)
	private List<Alumno> alumnos;
}
