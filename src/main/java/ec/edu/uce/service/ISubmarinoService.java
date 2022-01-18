package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Submarino;

public interface ISubmarinoService {
	
	void guardarSubmarino(Submarino submarino);
	void actializarSubmarino(Submarino submarino);
}
