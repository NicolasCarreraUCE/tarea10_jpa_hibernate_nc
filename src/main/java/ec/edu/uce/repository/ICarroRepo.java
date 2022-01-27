package ec.edu.uce.repository;

import ec.edu.uce.modelo.jpa.Carro;

public interface ICarroRepo {

	void insertarCarro(Carro carro);
	void actualizarCarro(Carro carro);
	Carro buscarCarroPorId(Integer id);
	void borrarCarroPorId(Integer id);
	
	Carro buscarCarroPorMatricula(String matricual);
	
	Carro buscarCarroPorMatriculaType(String matricual);
	Carro buscarCarroPorMatriculaNamed(String matricual);
	
	Carro buscarCarroPorMatriculaNative(String matricual);

	Carro buscarCarroPorMatriculaCiteriaAPI(String matricual);
}
