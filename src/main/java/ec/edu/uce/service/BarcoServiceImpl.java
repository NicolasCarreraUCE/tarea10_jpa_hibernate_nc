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

	@Override
	public Barco buscarBarco(Integer id) {
		// TODO Auto-generated method stub
		return this.barcoRepo.buscarBarcoPorId(id);
	}

	@Override
	public void borrarBarco(Integer id) {
		// TODO Auto-generated method stub
		this.barcoRepo.borrarBarcoPorId(id);
	}

	@Override
	public Barco buscarPorModelo(String modelo) {
		// TODO Auto-generated method stub
		return this.barcoRepo.buscarBarcoPorModelo(modelo);
	}

	@Override
	public Barco buscarPorModeloType(String modelo) {
		// TODO Auto-generated method stub
		return this.barcoRepo.buscarBarcoPorModeloType(modelo);
	}

	@Override
	public Barco buscarPorModeloNamed(String modelo) {
		// TODO Auto-generated method stub
		return this.barcoRepo.buscarBarcoPorModeloNamed(modelo);
	}

	@Override
	public Barco buscarPorModeloNative(String modelo) {
		// TODO Auto-generated method stub
		return this.barcoRepo.buscarBarcoPorModeloNative(modelo);
	}

}
