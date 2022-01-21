package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto {

	@Id
	@Column(name = "mot_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_moto")
	@SequenceGenerator(name = "seq_moto", sequenceName = "seq_moto", allocationSize = 1)
	private Integer id;
	
	@Column(name = "mot_marca")
	private String marca;
	
	@Column(name = "mot_num_placa")
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
