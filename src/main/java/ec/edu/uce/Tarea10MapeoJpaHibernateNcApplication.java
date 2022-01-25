package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.jpa.Avion;
import ec.edu.uce.modelo.jpa.Barco;
import ec.edu.uce.modelo.jpa.Carro;
import ec.edu.uce.modelo.jpa.Guardia;
import ec.edu.uce.modelo.jpa.Moto;
import ec.edu.uce.modelo.jpa.Submarino;
import ec.edu.uce.service.IAvionService;
import ec.edu.uce.service.IBarcoService;
import ec.edu.uce.service.ICarroService;
import ec.edu.uce.service.IGuardiaService;
import ec.edu.uce.service.IMotoService;
import ec.edu.uce.service.ISubmarinoService;

@SpringBootApplication
public class Tarea10MapeoJpaHibernateNcApplication implements CommandLineRunner {

	@Autowired
	private IGuardiaService guardiaService;
	
	@Autowired
	private IAvionService avionService;
	
	@Autowired
	private IBarcoService barcoService;
	
	@Autowired
	private ICarroService carroService;
	
	@Autowired
	private IMotoService motoService;
	
	@Autowired
	private ISubmarinoService submarinoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea10MapeoJpaHibernateNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Guardia g1 = new Guardia();
//		g1.setNombre("Pepito");
//		g1.setApellido("Torres");
//		g1.setEdificio("Naciones Unidas");
//		
//		this.guardiaService.guardarGuardia(g1);
//		
//		Avion av1 = new Avion();
//		av1.setModelo("F-35 Lightning II");
//		av1.setNumPasajeros(1);
//		
//		this.avionService.guardarAvion(av1);
//		
//		Barco ba1 = new Barco();
//		ba1.setModelo("RMS Titanic​");
//		ba1.setPropulsion("Motor de carbon");
//		
//		this.barcoService.guardarBarco(ba1);
//		
//		Carro ca1 = new Carro();
//		ca1.setMarca("Chevrolet");
//		ca1.setNumPlaca("ABC-100");
//		
//		this.carroService.guardarCarro(ca1);
//		
//		Moto mt1 = new Moto();
//		mt1.setMarca("Suzuki");
//		mt1.setNumPlaca("HD-200");
//		
//		this.motoService.guardarMoto(mt1);
//		
//		Submarino su1 = new Submarino();
//		su1.setModelo("Ocean Pearl");
//		su1.setProfundidadMax(1000.0);
//		
//		this.submarinoService.guardarSubmarino(su1);
//		
//		Guardia g2 = new Guardia();
//		g2.setId(1);
//		g2.setNombre("Juanito");
//		g2.setApellido("Teran");
//		g2.setEdificio("Villaflora");
//		
//		this.guardiaService.actializarGuardia(g2);
//		
//		Avion av2 = new Avion();
//		av2.setId(1);
//		av2.setModelo("Boeing 777-200");
//		av2.setNumPasajeros(100);
//		
//		this.avionService.actializarAvion(av2);
//		
//		Barco ba2 = new Barco();
//		ba2.setId(1);
//		ba2.setModelo("Sea Ray 350 SLX​");
//		ba2.setPropulsion("Motor de diecel");
//		
//		this.barcoService.actializarBarco(ba2);
//		
//		Carro ca2 = new Carro();
//		ca2.setId(1);
//		ca2.setMarca("Toyota");
//		ca2.setNumPlaca("PQR-345");
//		
//		this.carroService.actializarCarro(ca2);
//		
//		Moto mt2 = new Moto();
//		mt2.setId(1);
//		mt2.setMarca("Honda");
//		mt2.setNumPlaca("FK-321");
//		
//		this.motoService.actializarMoto(mt2);
//		
//		Submarino su2 = new Submarino();
//		su2.setId(1);
//		su2.setModelo("Typhoon");
//		su2.setProfundidadMax(500.0);
//		
//		this.submarinoService.actializarSubmarino(su2);
//		
//		Guardia g3 = this.guardiaService.buscarGuardia(1);
//
//		Avion av3 = this.avionService.buscarAvion(1);
//		
//		Barco ba3 = this.barcoService.buscarBarco(1);
//		
//		Carro ca3 = this.carroService.buscarCarro(1);
//		
//		Moto mt3 = this.motoService.buscarMoto(1);
//		
//		Submarino su3 = this.submarinoService.buscarSubmarino(1);
//		
//		this.guardiaService.borrarGuardia(1);
//		this.avionService.borrarAvion(1);
//		this.barcoService.borrarBarco(1);
//		this.carroService.borrarGuardar(1);
//		this.motoService.borrarMoto(1);
//		this.submarinoService.borrarSubmarino(1);
//		
//		Guardia g4 = this.guardiaService.buscarPorApellido("Teran");
//
//		Avion av4 = this.avionService.buscarPorModelo("Boeing 777-200");
//		
//		Barco ba4 = this.barcoService.buscarPorModelo("Sea Ray 350 SLX​");
//		
//		Carro ca4 = this.carroService.buscarPorMatricula("PQR-345");
//		
//		Moto mt4 = this.motoService.buscarMotoPorMatricula("FK-321");
//		
//		Submarino su4 = this.submarinoService.buscarSubmarinoPorModelo("Typhoon");

//		Guardia g4 = this.guardiaService.buscarPorApellidoType("Teran");
//
//		Avion av4 = this.avionService.buscarPorModeloType("Boeing 777-200");
//		
//		Barco ba4 = this.barcoService.buscarPorModeloType("Sea Ray 350 SLX​");
//		
//		Carro ca4 = this.carroService.buscarPorMatriculaType("PQR-345");
//		
//		Moto mt4 = this.motoService.buscarPorMatriculaType("FK-321");
//		
//		Submarino su4 = this.submarinoService.buscarPorModeloType("Typhoon");
//
//		
//		Guardia g5 = this.guardiaService.buscarPorApellidoType("Teran");
//
//		Avion av5 = this.avionService.buscarPorModeloType("Boeing 777-200");
//		
//		Barco ba5 = this.barcoService.buscarPorModeloType("Sea Ray 350 SLX​");
//		
//		Carro ca5 = this.carroService.buscarPorMatriculaType("PQR-345");
//		
//		Moto mt5 = this.motoService.buscarPorMatriculaType("FK-321");
//		
//		Submarino su5 = this.submarinoService.buscarPorModeloType("Typhoon");

		this.guardiaService.buscarPorApellidoNative("Teran");
		this.avionService.buscarPorModeloNative("Boeing 777-200");
		this.barcoService.buscarPorModeloNative("RMS Titanic");
		this.carroService.buscarPorMatriculaNative("PQR-345");
		this.motoService.buscarPorMatriculaNative("FK-321");
		this.submarinoService.buscarPorModeloNative("Typhoon");
	}

}
