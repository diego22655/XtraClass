package pe.edu.upc.XtraClass.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
