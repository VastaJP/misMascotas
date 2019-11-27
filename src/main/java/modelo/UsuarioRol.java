package modelo;

import javax.persistence.*;	

@Entity
@Table(name="usuarios_roles")
public class UsuarioRol {
	
	@Column(name="id_usuario")
	private Long idUsuario;
	
	@Column(name="id_rol")
	private String idRol;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	
}