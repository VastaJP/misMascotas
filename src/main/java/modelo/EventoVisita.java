package modelo;

import java.sql.Date;

import javax.persistence.*;	

@Entity
@Table(name="eventos_visitas")
public class EventoVisita {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_evento")
	private Long id;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="fecha")
	private String descripcion;
	
	@Column(name="id_mascota")
	private Long id_mascota;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}
	
}
