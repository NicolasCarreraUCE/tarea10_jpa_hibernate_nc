package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class AvionRepoImpl implements IAvionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

	@Override
	public void actualizarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(avion);
	}

	@Override
	public Avion buscarAvionPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Avion.class, id);
	}

	@Override
	public void borrarAvionPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarAvionPorId(id));
	}

	@Override
	public Avion buscarAvionPorModelo(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("SELECT a FROM Avion a WHERE a.avi_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		Avion miAvion = (Avion) miQuery.getSingleResult();
		return miAvion;
	}

	/**
	 * Buscar por PypeQuery
	 */
	@Override
	public Avion buscarAvionPorModeloType(String modelo) {
		// TODO Auto-generated method stub
		TypedQuery<Avion> miQuery = (TypedQuery<Avion>) this.entityManager.createQuery("SELECT a FROM Avion a WHERE a.avi_modelo=:valor");
		miQuery.setParameter("valor", modelo);
		return miQuery.getSingleResult();
	}

	/**
	 * Buscar por NamedQuery
	 */
	@Override
	public Avion buscarAvionPorModeloNamed(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Avion.buscarPorModelo");
		miQuery.setParameter("valor", modelo);
		return (Avion) miQuery.getSingleResult();
	}

	@Override
	public Avion buscarAvionPorModeloNative(String modelo) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM avion a WHERE a.avi_modelo=:valor", Avion.class);
		miQuery.setParameter("valor", modelo);

		return (Avion) miQuery.getSingleResult();
	}

	@Override
	public Avion buscarAvionPorModeloCiteriaAPI(String modelo) {
		// TODO Auto-generated method stub
		CriteriaBuilder miCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Avion> miQuery = miCriteriaBuilder.createQuery(Avion.class);
		
		Root<Avion> miTabla = miQuery.from(Avion.class);
		
		Predicate predicado= miCriteriaBuilder.equal(miTabla.get("modelo"), modelo);
		
		miQuery.select(miTabla).where(predicado);
		
		TypedQuery<Avion> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
