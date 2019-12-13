package dao.hibernateJPA;

import dao.clases.RolDAO;
import modelo.Rol;

public class RolDAOHibernateJPA extends GenericDAOHibernateJPA<Rol>implements RolDAO {
		public RolDAOHibernateJPA() {
			super(Rol.class);
		}
}
