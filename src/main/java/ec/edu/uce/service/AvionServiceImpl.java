package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.repository.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo avionRepo;
	
	@Override
	public void guardarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.insertarAvion(avion);
	}

	@Override
	public void actializarAvion(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.actualizarAvion(avion);
	}

}
