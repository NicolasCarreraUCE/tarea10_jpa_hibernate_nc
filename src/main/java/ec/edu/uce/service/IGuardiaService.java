package ec.edu.uce.service;

import ec.edu.uce.modelo.jpa.Guardia;

public interface IGuardiaService {

	void guardarGuardia(Guardia guardia);
	void actializarGuardia(Guardia guardia);
	Guardia buscarGuardia(Integer id);
	void borrarGuardia(Integer id);
	
	Guardia buscarPorApellido(String apellido);
<<<<<<< HEAD

	Guardia buscarPorApellidoType(String apellido);
	Guardia buscarPorApellidoName(String apellido);
=======
	
	Guardia buscarGuardiaPorApellidoLista(String apellido);
	
	Guardia buscarGuardiaPorApellidoListaTyped(String apellido);

	Guardia buscarGuardiaPorApellidoListaNamed(String apellido);

	Guardia buscarGuardiaPorApellidoListaNative(String apellido);

>>>>>>> branch 'master' of https://github.com/NicolasCarreraUCE/tarea10_jpa_hibernate_nc.git
}
