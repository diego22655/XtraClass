package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asuntos")
public class Asunto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nomAsunto",length = 15, nullable = false)
	private String nomAsunto;
	
	@Column(name = "descripcion",length = 120, nullable = false)
	private String descripcion;
	
}
