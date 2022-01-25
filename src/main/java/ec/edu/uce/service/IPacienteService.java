package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void guardarNuevoPaciente(Paciente paciente);
	void borrarPacientePorId(Integer id);
	void apctualizarPaciente(Paciente paciente);
	Paciente buscarPacientePorId(Integer id);
	
}
