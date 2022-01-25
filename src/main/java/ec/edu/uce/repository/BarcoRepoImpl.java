package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
		return this.entityManager.find(Barco.class, id);
	}

	@Override
	public void borrarBarcoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarBarcoPorId(id));
	}

	@Override
	public Barco buscarBarcoPorModelo(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("SELECT b FROM Barco b WHERE b.bar_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		Barco miBarco = (Barco) miQuery.getSingleResult();
		return miBarco;
	}

	/**
	 * Buscar por TypeQuery
	 */
	@Override
	public Barco buscarBarcoPorModeloType(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Barco> miQuery = (TypedQuery<Barco>) this.entityManager.createQuery("SELECT b FROM Barco b WHERE b.bar_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		return miQuery.getSingleResult();
	}

	/**
	 * Buscar por NamedQuery
	 */
	@Override
	public Barco buscarBarcoPorModeloNamed(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Barco.buscarPorModelo");
		miQuery.setParameter("valor", modelo);
		return (Barco) miQuery.getSingleResult();
	}

	@Override
	public Barco buscarBarcoPorModeloNative(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM barco b WHERE b.bar_modelo=:valor", Barco.class);
		miQuery.setParameter("valor", modelo);
		return (Barco) miQuery.getSingleResult();
	}

}
