package modelo;

import java.sql.Date;

import javax.persistence.*;	

@Entity
@Table(name="eventos_atenciones")
public class EventoAtencion {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id_atencion")
	private Long id;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="motivo")
	private String motivo;
	
	@Column(name="diagnostico")
	private String diagnostico;
	
	@Column(name="indicaciones")
	private String indicaciones;
	
	@Column(name="id_veterinario")
	private Long id_veterinario;
	
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

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public Long getId_veterinario() {
		return id_veterinario;
	}

	public void setId_veterinario(Long id_veterinario) {
		this.id_veterinario = id_veterinario;
	}

	public Long getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(Long id_mascota) {
		this.id_mascota = id_mascota;
	}
	
}
