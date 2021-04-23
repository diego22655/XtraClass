package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foros")
public class Foro {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Foro_ID", columnDefinition="NUMERIC(6)")
	 private Integer id;

	 @Column(name="Asunto", length = 25)
	 private String asunto;
		 
	 @Column(name="Comentario", length = 255)
	 private String comentario;
	 
	 @ManyToOne
	 @JoinColumn(name = "Alumno_ID", nullable = false)
	 private Alumno alumno;
}
