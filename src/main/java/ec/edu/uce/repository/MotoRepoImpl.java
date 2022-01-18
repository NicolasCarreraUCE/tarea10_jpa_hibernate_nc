package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Moto;

@Repository
@Transactional
public class MotoRepoImpl implements IMotoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarMoto(Moto moto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(moto);
	}

	@Override
	public void actualizarMoto(Moto moto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(moto);
	}

	@Override
	public Moto buscarMotoPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarMotoPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
