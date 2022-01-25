package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Carro;

public interface ICarroService {

	void guardarCarro(Carro carro);
	void actializarCarro(Carro carro);
	Carro buscarCarro(Integer id);
	void borrarGuardar(Integer id);
	
	Carro buscarPorMatricula(String matricula);
	
	Carro buscarPorMatriculaType(String matricual);
	Carro buscarPorMatriculaNamed(String matricual);
	
	Carro buscarPorMatriculaNative(String matricual);
}
