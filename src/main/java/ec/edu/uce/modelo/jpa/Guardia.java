package ec.edu.uce.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guardia") // Este es absolulamente nesesarioo cuando la tabla tiene un nombre diferente
public class Guardia {

	@Id // Define la clave primaria
	@GeneratedValue // General el id aprtir de una secuancia
	@Column(name="id") // Relaciona el argumento con la columna de la base de datos
	private Integer id;
	
	@Column(name="nombre") // Se puede omitir si tienen el mismo nombre como en este caso
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="edificio")
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
