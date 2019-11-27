package modelo;

import java.sql.Date;

import javax.persistence.*;	

@Entity
@Table(name="recordatorios")
public class Recordatorio {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_recordatorio")
	private Long id;
	
	@Column(name="fecha")
	private Date fecha_nac;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="id_cliente")
	private Long id_cliente;
	
	@Column(name="id_evento")
	private Long id_evento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_evento() {
		return id_evento;
	}

	public void setId_evento(Long id_evento) {
		this.id_evento = id_evento;
	}
	
}
