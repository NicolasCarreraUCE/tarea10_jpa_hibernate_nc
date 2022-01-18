package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Barco;

public interface IBarcoService {

	void guardarBarco(Barco barco);
	void actializarBarco(Barco barco);
}
