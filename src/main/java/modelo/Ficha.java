package modelo;

import javax.persistence.*;	

@Entity
@Table(name="fichas")
public class Ficha {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_ficha")
	private Long id;
	
	@Column(name="nombre_dato")
	private String nombre_dato;
	
	@Column(name="publico")
	private String publico;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="id_mascota")
	private Long id_mascota;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_dato() {
		return nombre_dato;
	}

	public void setNombre_dato(String nombre_dato) {
		this.nombre_dato = nombre_dato;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}
	
}
