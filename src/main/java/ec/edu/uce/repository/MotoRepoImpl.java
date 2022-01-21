package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		Query miQuery = this.entityManager.createQuery("SELECT m FROM Moto m WHERE m.mot_marca=:valor");
		miQuery.setParameter("valor", matricula);
		Moto miMoto = (Moto) miQuery.getSingleResult();
		return miMoto;
	}

}
