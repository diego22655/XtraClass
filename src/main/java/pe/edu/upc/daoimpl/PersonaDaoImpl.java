package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonaDao;
import pe.edu.upc.entities.Persona;

public class PersonaDaoImpl implements IPersonaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "XtraClassPU")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Persona p) {
		em.persist(p);	
	}

}
