package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Submarino;

@Repository
@Transactional
public class SubmarinoRepoImpl implements ISubmarinoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarSubmarino(Submarino submarino) {
		// TODO Auto-generated method stub
		this.entityManager.persist(submarino);
	}

	@Override
	public void actualizarSubmarino(Submarino submarino) {
		// TODO Auto-generated method stub
		this.entityManager.merge(submarino);
	}

	@Override
	public Submarino buscarSubmarinoPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarSubmarinoPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
