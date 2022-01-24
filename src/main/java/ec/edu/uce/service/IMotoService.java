package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Moto;

public interface IMotoService {

	void guardarMoto(Moto moto);
	void actializarMoto(Moto moto);
	Moto buscarMoto(Integer id);
	void borrarMoto(Integer id);
	
	Moto buscarMotoPorMatricula(String matricula);
	
	Moto buscarPorMatriculaType(String matricula);
	Moto buscarPorMatriculaNamed(String matricula);
}
