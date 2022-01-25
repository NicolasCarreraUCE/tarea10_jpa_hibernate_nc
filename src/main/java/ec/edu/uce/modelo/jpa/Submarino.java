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
@Table(name = "submarino")
//@NamedQuery(name = "Submarino.buscarPorModelo", query = "SELECT s FROM Submarino s WHERE s.sub_modelo=:valor")
public class Submarino {

	@Id
	@Column(name = "sub_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_submarino")
	@SequenceGenerator(name = "seq_submarino", sequenceName = "seq_submarino", allocationSize = 1)
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
