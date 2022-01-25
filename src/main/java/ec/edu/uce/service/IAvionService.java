package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Avion;

public interface IAvionService {

	void guardarAvion(Avion avion);
	void actializarAvion(Avion avion);
	Avion buscarAvion(Integer id);
	void borrarAvion(Integer id);
	
	Avion buscarPorModelo(String modelo);
	
	Avion buscarPorModeloType(String modelo);
	Avion buscarPorModeloNamed(String modelo);
	
	Avion buscarPorModeloNative(String modelo);
}
