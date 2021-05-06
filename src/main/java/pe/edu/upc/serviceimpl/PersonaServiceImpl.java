package pe.edu.upc.serviceimpl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPersonaDao;
import pe.edu.upc.entities.Persona;
import pe.edu.upc.service.IPersonaService;

@Named
@RequestScoped

public class PersonaServiceImpl implements IPersonaService{
	
	@Inject
	private IPersonaDao pD;
	
	@Override
	public void insert(Persona p) {
		pD.insert(p);
	}

}
