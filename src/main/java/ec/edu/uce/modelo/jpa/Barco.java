package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "barco")
public class Barco {

	@Id
	@Column(name = "bar_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_barco")
	@SequenceGenerator(name = "seq_barco", sequenceName = "seq_barco", allocationSize = 1)
	private Integer id;
	
	@Column(name = "bar_modelo")
	private String modelo;
	
	@Column(name = "bar_propulsion")
	private String propulsion;

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

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}
	
	
}
