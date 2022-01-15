package ec.edu.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;

@Repository
public class RecetaRepoImpl implements IRecetaRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insertarReceta(Receta receta) {
		// TODO Auto-generated method stub
		Object[] datosAInsertar = new Object[] {
				receta.getId(),
				receta.getIndicaciones(),
				receta.getMedicamentos()
		};
		this.jdbcTemplate.update("INSERT INTO public.receta(\r\n"
				+ "	id, indicaciones, medicamanetos)\r\n"
				+ "	VALUES (?, ?, ?);",datosAInsertar);
	}

	@Override
	public Paciente buscarReceta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarReceta(Receta receta) {
		// TODO Auto-generated method stub
		Object[] datosAActualizar = new Object[] {
				
		};
	}

	@Override
	public void borrarReceta(Integer id) {
		// TODO Auto-generated method stub
		Object[] datosABorrar = new Object[] {
				
		};
	}

}
