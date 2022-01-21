package ec.edu.uce.repository;

import ec.edu.uce.modelo.jpa.Avion;

public interface IAvionRepo {

	void insertarAvion(Avion avion);
	void actualizarAvion(Avion avion);
	Avion buscarAvionPorId(Integer id);
	void borrarAvionPorId(Integer id);
	Avion buscarAvionPorModelo(String modelo);
}
