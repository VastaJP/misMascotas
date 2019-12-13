package dao.hibernateJPA;

import dao.clases.UsuarioDAO;
import modelo.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO{
	 public UsuarioDAOHibernateJPA() {
		 super(Usuario.class);
	 }
	 // puede que haya que agregar algun que otro metodo particular para la clase usuario
}