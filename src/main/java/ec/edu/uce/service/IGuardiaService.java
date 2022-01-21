package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {

	void guardarGuardia(Guardia guardia);
	void actializarGuardia(Guardia guardia);
	Guardia buscarGuardia(Integer id);
	void borrarGuardia(Integer id);
	
	Guardia buscarPorApellido(String apellido);
}
