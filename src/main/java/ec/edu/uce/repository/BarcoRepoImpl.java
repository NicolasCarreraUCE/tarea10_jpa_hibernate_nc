package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Barco;

@Repository
@Transactional
public class BarcoRepoImpl implements IBarcoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarBarco(Barco barco) {
		// TODO Auto-generated method stub
		this.entityManager.persist(barco);
	}

	@Override
	public void actualizarBarco(Barco barco) {
		// TODO Auto-generated method stub
		this.entityManager.merge(barco);
	}

	@Override
	public Barco buscarBarcoPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarBarcoPorId(Integer id) {
		// TODO Auto-generated method stub

	}

}
