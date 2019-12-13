package dao.hibernateJPA;

import dao.clases.UsuarioRolDAO;
import modelo.UsuarioRol;

public class UsuarioRolDAOHibernateJPA extends GenericDAOHibernateJPA<UsuarioRol>  implements UsuarioRolDAO{
		public UsuarioRolDAOHibernateJPA() {
			super(UsuarioRol.class);
		}
}
