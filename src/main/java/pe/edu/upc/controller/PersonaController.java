package pe.edu.upc.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Persona;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped
public class PersonaController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPersonaService pS;
	
	private Persona persona;
	
	@PostConstruct
	public void init() {
		this.persona = new Persona();
	}
	
	public String newPersona() {
		this.setPersona(new Persona());
		return "persona.xhtml";
	}
	
	public void insert() {
		pS.insert(persona);
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
}
