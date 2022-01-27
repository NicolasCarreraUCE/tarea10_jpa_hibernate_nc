package ec.edu.uce.repository;

import ec.edu.uce.modelo.jpa.Moto;

public interface IMotoRepo {

	void insertarMoto(Moto moto);
	void actualizarMoto(Moto moto);
	Moto buscarMotoPorId(Integer id);
	void borrarMotoPorId(Integer id);
	
	Moto buscarMotoPorMatricula(String matricula);
	
	Moto buscarMotoPorMatriculaType(String matricula);
	Moto buscarMotoPorMatriculaNamed(String matricula);
	
	Moto buscarMotoPorMatriculaNative(String matricula);

	Moto buscarMotoPorMatriculaCiteriaAPI(String matricula);
}
