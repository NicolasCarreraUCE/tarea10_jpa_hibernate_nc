package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.jpa.Carro;
import ec.edu.uce.repository.ICarroRepo;

@Service
public class CarroServiceImpl implements ICarroService {

	@Autowired
	private ICarroRepo carroRepo;
	
	@Override
	public void guardarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.insertarCarro(carro);
	}

	@Override
	public void actializarCarro(Carro carro) {
		// TODO Auto-generated method stub
		this.carroRepo.actualizarCarro(carro);
	}

	@Override
	public Carro buscarCarro(Integer id) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarCarroPorId(id);
	}

	@Override
	public void borrarGuardar(Integer id) {
		// TODO Auto-generated method stub
		this.carroRepo.borrarCarroPorId(id);
	}

	@Override
	public Carro buscarPorMatricula(String matricula) {
		// TODO Auto-generated method stub
		return this.carroRepo.buscarCarroPorMatricula(matricula);
	}

}
