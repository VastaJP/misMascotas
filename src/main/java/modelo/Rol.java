package modelo;

import javax.persistence.*;	

@Entity
@Table(name="roles")
public class Rol {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;

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
	
}
