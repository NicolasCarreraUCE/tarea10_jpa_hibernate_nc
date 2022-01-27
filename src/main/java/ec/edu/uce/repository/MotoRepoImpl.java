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
		return this.entityManager.find(Moto.class, id);
	}

	@Override
	public void borrarMotoPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarMotoPorId(id));
	}

	@Override
	public Moto buscarMotoPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT m FROM Moto m WHERE m.mot_marca=:valor", Moto.class);
		miQuery.setParameter("valor", matricula);
		Moto miMoto = (Moto) miQuery.getSingleResult();
		return miMoto;
	}

	/**
	 * Consulta por TypeQuery
	 */
	@Override
	public Moto buscarMotoPorMatriculaType(String matricula) {
		// TODO Auto-generated method stub
		TypedQuery<Moto> miQuery = (TypedQuery<Moto>) this.entityManager.createQuery("SELECT m FROM Moto m WHERE m.mot_marca=:valor");
		miQuery.setParameter("valor", matricula);
		return miQuery.getSingleResult();
	}

	/**
	 * Consulta por NamedQuery
	 */
	@Override
	public Moto buscarMotoPorMatriculaNamed(String matricula) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Moto.buscarPorMatricula");
		miQuery.setParameter("valor", matricula);
		return (Moto) miQuery.getSingleResult();
	}

	@Override
	public Moto buscarMotoPorMatriculaNative(String matricula) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM moto m WHERE m.mot_num_placa=:valor", Moto.class);
		miQuery.setParameter("valor", matricula);
		return (Moto) miQuery.getSingleResult();
	}

	@Override
	public Moto buscarMotoPorMatriculaCiteriaAPI(String matricula) {
		// TODO Auto-generated method stub
		CriteriaBuilder miCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Moto> miQuery = miCriteriaBuilder.createQuery(Moto.class);
		
		Root<Moto> miTabla = miQuery.from(Moto.class);
		
		Predicate predicado= miCriteriaBuilder.equal(miTabla.get("numPlaca"), matricula);
		
		miQuery.select(miTabla).where(predicado);
		
		TypedQuery<Moto> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
