package dao.hibernateJPA;

import dao.clases.*;
import dao.hibernateJPA.*;

public class DAOFactory {

	
		public static UsuarioDAO getUsuarioDAO(){
			return new UsuarioDAOHibernateJPA();
		}
		
		public static MascotaDAO getMascotaDAO() {
			return new MascotaDAOHibernateJPA();
		}
	
	
}
