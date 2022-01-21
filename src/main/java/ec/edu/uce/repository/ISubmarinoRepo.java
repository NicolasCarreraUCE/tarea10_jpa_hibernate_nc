package ec.edu.uce.repository;

import ec.edu.uce.modelo.jpa.Submarino;

public interface ISubmarinoRepo {

	void insertarSubmarino(Submarino submarino);
	void actualizarSubmarino(Submarino submarino);
	Submarino buscarSubmarinoPorId(Integer id);
	void borrarSubmarinoPorId(Integer id);
	
	Submarino buscarSubmarinoPorModelo(String modelo);
}
