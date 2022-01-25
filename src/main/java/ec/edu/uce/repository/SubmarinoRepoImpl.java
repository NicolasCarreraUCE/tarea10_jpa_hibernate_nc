package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
		return this.entityManager.find(Submarino.class, id);
	}

	@Override
	public void borrarSubmarinoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarSubmarinoPorId(id));
	}

	@Override
	public Submarino buscarSubmarinoPorModelo(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("SELECT s FROM Submarino s WHERE s.sub_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		Submarino miSubmarino = (Submarino) miQuery.getSingleResult();
		return miSubmarino;
	}

	/**
	 * Consulta por TypeQuery
	 */
	@Override
	public Submarino buscarSubmarinoPorModeloType(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Submarino> miQuery = (TypedQuery<Submarino>) this.entityManager.createQuery("SELECT s FROM Submarino s WHERE s.sub_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		return miQuery.getSingleResult();
	}

	/**
	 * Consulta por NamedQuery
	 */
	@Override
	public Submarino buscarSubmarinoPorModeloNamed(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Submarino.buscarPorModelo");
		miQuery.setParameter("valor", modelo);
		return (Submarino) miQuery.getSingleResult();
	}

	@Override
	public Submarino buscarSubmarinoPorModeloNative(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM submarino s WHERE s.sub_modelo=:valor", Submarino.class);
		miQuery.setParameter("valor", modelo);
		return (Submarino) miQuery.getSingleResult();
	}

}
