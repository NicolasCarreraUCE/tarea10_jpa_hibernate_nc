package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Submarino;
import ec.edu.uce.repository.ISubmarinoRepo;

@Service
public class SubmarinoServiceImpl implements ISubmarinoService {

	@Autowired
	private ISubmarinoRepo submarinoRepo;
	
	@Override
	public void guardarSubmarino(Submarino submarino) {
		// TODO Auto-generated method stub
		this.submarinoRepo.insertarSubmarino(submarino);
	}

	@Override
	public void actializarSubmarino(Submarino submarino) {
		// TODO Auto-generated method stub
		this.submarinoRepo.actualizarSubmarino(submarino);
	}

	@Override
	public Submarino buscarSubmarino(Integer id) {
		// TODO Auto-generated method stub
		return this.submarinoRepo.buscarSubmarinoPorId(id);
	}

	@Override
	public void borrarSubmarino(Integer id) {
		// TODO Auto-generated method stub
		this.submarinoRepo.borrarSubmarinoPorId(id);
	}

	@Override
	public Submarino buscarSubmarinoPorModelo(String modelo) {
		// TODO Auto-generated method stub
		return this.submarinoRepo.buscarSubmarinoPorModelo(modelo);
	}

	

}
