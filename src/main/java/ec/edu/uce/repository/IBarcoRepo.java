package ec.edu.uce.repository;

import ec.edu.uce.modelo.jpa.Barco;

public interface IBarcoRepo {

	void insertarBarco(Barco barco);
	void actualizarBarco(Barco barco);
	Barco buscarBarcoPorId(Integer id);
	void borrarBarcoPorId(Integer id);
	
	Barco buscarBarcoPorModelo(String modelo);
	
	Barco buscarBarcoPorModeloType(String modelo);
	Barco buscarBarcoPorModeloNamed(String modelo);
	
	Barco buscarBarcoPorModeloNative(String modelo);
	
}
