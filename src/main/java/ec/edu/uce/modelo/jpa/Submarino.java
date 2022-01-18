package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submarino")
public class Submarino {

	@Id
	@GeneratedValue
	@Column(name = "sub_id")
	private Integer id;
	
	@Column(name = "sub_modelo")
	private String modelo;
	
	@Column(name = "sub_profundidad_max")
	private Double profundidadMax;

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

	public Double getProfundidadMax() {
		return profundidadMax;
	}

	public void setProfundidadMax(Double profundidadMax) {
		this.profundidadMax = profundidadMax;
	}
	
}
