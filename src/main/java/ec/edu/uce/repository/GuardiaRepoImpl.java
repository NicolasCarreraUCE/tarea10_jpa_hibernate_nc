package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.jpa.Guardia;

@Repository
@Transactional
public class GuardiaRepoImpl implements IGuardiaRepo {

	private static final Logger LOG = LoggerFactory.getLogger(GuardiaRepoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(guardia);
	}

	@Override
	public void actualizarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(guardia);
	}

	@Override
	public Guardia buscarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Guardia.class, id);
	}

	@Override
	public void borrarGuardiaPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarGuardiaPorId(id));
	}

	@Override
	public Guardia buscarGuardiaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createQuery("SELECT g FROM Guardia g WHERE g.gua_apellido=:valor");
		miQuery.setParameter("valor", apellido);
		Guardia miGuardia = (Guardia) miQuery.getSingleResult();
		return miGuardia;
	}

	/**
	 * Consulta por TypeQuery
	 */
	@Override
	public Guardia buscarGuardiaPorApellidoType(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Guardia> miQuery  = (TypedQuery<Guardia>) this.entityManager.createQuery("SELECT g FROM Guardia g WHERE g.gua_apellido=:valor");
		miQuery.setParameter("valor", apellido);
		return miQuery.getSingleResult();
	}

	/**
	 * Consulta por NamedQuery
	 */
	@Override
	public Guardia buscarGuardiaPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		Query miQuery = this.entityManager.createNamedQuery("Guardia.buscarPorApellido");
		miQuery.setParameter("valor", apellido);
		return (Guardia) miQuery.getSingleResult();
	}

}
