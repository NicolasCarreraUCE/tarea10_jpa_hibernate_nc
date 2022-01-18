package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.repository.jpa.IGuardiaRepo;

@Service //loguica de negocio
public class GuardiaServiceImpl implements IGuardiaService {

	@Autowired
	IGuardiaRepo guardiaRepo;
	
	@Override
	public void guardarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.guardiaRepo.insertarGuardia(guardia);
	}

	@Override
	public void actializarGuardia(Guardia guardia) {
		// TODO Auto-generated method stub
		this.guardiaRepo.actualizarGuardia(guardia);
	}

}
