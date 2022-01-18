package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@GeneratedValue
	@Column(name = "avi_id")
	private Integer id;
	
	@Column(name = "avi_modelo")
	private String modelo;
	
	@Column(name = "avi_num_pasajeros")
	private Integer numPasajeros;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(Integer num_pasajeros) {
		this.numPasajeros = num_pasajeros;
	}
	
	
}
