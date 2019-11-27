package modelo;

import javax.persistence.*;	

@Entity
@Table(name="consultorios")
public class Consultorio {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_consultorio")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="domicilio")
	private String domicilio;
	
	@Column(name="id_veterinario")
	private Long id_veterinario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Long getId_veterinario() {
		return id_veterinario;
	}

	public void setId_veterinario(Long id_veterinario) {
		this.id_veterinario = id_veterinario;
	}
	
}
