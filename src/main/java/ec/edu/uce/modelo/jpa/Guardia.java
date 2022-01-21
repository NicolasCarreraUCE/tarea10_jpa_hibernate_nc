package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="guardia") 
public class Guardia {

	@Id 
	@Column(name="gua_id") 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_guardia")
	@SequenceGenerator(name = "seq_guardia", sequenceName = "seq_guardia", allocationSize = 1)
	private Integer id;
	
	@Column(name="gua_nombre") 
	private String nombre;
	
	@Column(name="gua_apellido")
	private String apellido;
	
	@Column(name="gua_edificio")
	private String edificio;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	
}
