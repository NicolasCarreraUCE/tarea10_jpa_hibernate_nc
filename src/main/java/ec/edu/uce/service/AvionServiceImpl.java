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

	@Override
	public Avion buscarAvion(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarAvion(Integer id) {
		// TODO Auto-generated method stub
		this.avionRepo.borrarAvionPorId(id);
	}

	@Override
	public Avion buscarPorModelo(String modelo) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarAvionPorModelo(modelo);
	}

	@Override
	public Avion buscarPorModeloType(String modelo) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarAvionPorModeloType(modelo);
	}

	@Override
	public Avion buscarPorModeloNamed(String modelo) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarAvionPorModeloNamed(modelo);
	}

}
