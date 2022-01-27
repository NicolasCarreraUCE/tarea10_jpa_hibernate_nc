package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Barco;

public interface IBarcoService {

	void guardarBarco(Barco barco);
	void actializarBarco(Barco barco);
	Barco buscarBarco(Integer id);
	void borrarBarco(Integer id);
	
	Barco buscarPorModelo(String modelo); 
	
	Barco buscarPorModeloType(String modelo);
	Barco buscarPorModeloNamed(String modelo);
	
	Barco buscarPorModeloNative(String modelo);

	Barco buscarBarcoPorModeloCiteriaAPI(String modelo);

}
