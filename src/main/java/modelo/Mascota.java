package modelo;

import java.sql.Date;

import javax.persistence.*;	

@Entity
@Table(name="mascota")
public class Mascota {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_mascota")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fecha_nac")
	private Date fecha_nac;
	
	@Column(name="especie")
	private String especie;
	
	@Column(name="raza")
	private String raza;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="color")
	private String color;
	
	@Column(name="senas_particulares")
	private String senias_particulares;
	
	@Column(name="id_cliente")
	private Long id_cliente;
	
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

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSenias_particulares() {
		return senias_particulares;
	}

	public void setSenias_particulares(String senias_particulares) {
		this.senias_particulares = senias_particulares;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_veterinario() {
		return id_veterinario;
	}

	public void setId_veterinario(Long id_veterinario) {
		this.id_veterinario = id_veterinario;
	}
}
