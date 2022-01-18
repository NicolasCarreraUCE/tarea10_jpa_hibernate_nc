package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Barco;
import ec.edu.uce.repository.IBarcoRepo;

@Service
public class BarcoServiceImpl implements IBarcoService {

	@Autowired
	private IBarcoRepo barcoRepo;
	
	@Override
	public void guardarBarco(Barco barco) {
		// TODO Auto-generated method stub
		this.barcoRepo.insertarBarco(barco);
	}

	@Override
	public void actializarBarco(Barco barco) {
		// TODO Auto-generated method stub
		this.barcoRepo.actualizarBarco(barco);
	}

}
