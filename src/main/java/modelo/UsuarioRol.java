package modelo;

import javax.persistence.*;	

@Entity
@Table(name="usuarios_roles")
public class UsuarioRol {
	
	@Id @GeneratedValue(generator="increment")
	@Column(name="id")
	private Long id;
	
	@Column(name="id_usuario")
	private Long idUsuario;
	
	@Column(name="id_rol")
	private Long idRol;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	
}