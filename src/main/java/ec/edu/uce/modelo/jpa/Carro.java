package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
@NamedQuery(name = "Carro.buscarPorMatricula", query = "SELECT c FROM Carro c WHERE c.car_num_placa=:valor")
public class Carro {

	@Id
	@Column(name = "car_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_carro")
	@SequenceGenerator(name = "seq_carro", sequenceName = "seq_carro", allocationSize = 1)
	private Integer id;
	
	@Column(name = "car_marca")
	private String marca;
	
	@Column(name = "car_num_placa")
	private String numPlaca;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumPlaca() {
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	
}
