package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Moto;
import ec.edu.uce.repository.IMotoRepo;

@Service
public class MotoServiceImpl implements IMotoService {

	@Autowired
	private IMotoRepo motoRepo;
	
	@Override
	public void guardarMoto(Moto moto) {
		// TODO Auto-generated method stub
		this.motoRepo.insertarMoto(moto);
	}

	@Override
	public void actializarMoto(Moto moto) {
		// TODO Auto-generated method stub
		this.motoRepo.actualizarMoto(moto);
	}

}
