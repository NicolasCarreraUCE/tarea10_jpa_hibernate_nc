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

import ec.edu.uce.modelo.jpa.Carro;

@Repository
@Transactional
public class CarroRepoImpl implements ICarroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(carro);
	}

	@Override
	public void actualizarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(carro);
	}

	@Override
	public Carro buscarCarroPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Carro.class, id);
	}

	@Override
	public void borrarCarroPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarCarroPorId(id));
	}

	@Override
	public Carro buscarCarroPorMatricula(String matricual) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("SELECT c FROM Carro c WHERE c.car_num_placa=:valor");
		miQuery.setParameter("valor", matricual);
		Carro miCarro = (Carro) miQuery.getSingleResult();
		return miCarro;
	}

	/**
	 * Consulta por TypeQuery
	 */
	@Override
	public Carro buscarCarroPorMatriculaType(String matricual) {
		// TODO Auto-generated method stub
		TypedQuery<Carro> miQuery = (TypedQuery<Carro>) this.entityManager.createQuery("SELECT c FROM Carro c WHERE c.car_num_placa=:valor");
		miQuery.setParameter("valor", matricual);
		return miQuery.getSingleResult();
	}

	/**
	 * Consulta por NamedQuery
	 */
	@Override
	public Carro buscarCarroPorMatriculaNamed(String matricual) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Carro.buscarPorMatricula");
		miQuery.setParameter("valor", matricual);
		return (Carro) miQuery.getSingleResult();
	}

	@Override
	public Carro buscarCarroPorMatriculaNative(String matricual) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNativeQuery("SELECT * FROM carro c WHERE c.car_num_placa=:valor", Carro.class);
		miQuery.setParameter("valor", matricual);
		return (Carro) miQuery.getSingleResult();
	}

	@Override
	public Carro buscarCarroPorMatriculaCiteriaAPI(String matricual) {
		// TODO Auto-generated method stub
		CriteriaBuilder miCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Carro> miQuery = miCriteriaBuilder.createQuery(Carro.class);
		
		Root<Carro> miTabla = miQuery.from(Carro.class);
		
		Predicate predicado= miCriteriaBuilder.equal(miTabla.get("numPlaca"), matricual);
		
		miQuery.select(miTabla).where(predicado);
		
		TypedQuery<Carro> typedQuery = this.entityManager.createQuery(miQuery);
		
		return typedQuery.getSingleResult();
	}

}
