package pe.edu.upc.XtraClass.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Docente")
public class Docente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Docente_ID")
    private Integer id;

    @Column(name = "NumeroCuenta", length = 20, nullable = false)
    private String numeroCuenta;
    
    @ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
    
    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<ReservaClase> reservaciones;

    @OneToMany(mappedBy = "docente", fetch = FetchType.LAZY)
    private List<MateriaProfesor> materiaProfesor;
}
