package dao.hibernateJPA;

import dao.clases.ConsultorioDAO;
import modelo.Consultorio;

public class ConsultorioDAOHibernateJPA extends GenericDAOHibernateJPA<Consultorio> implements ConsultorioDAO {
	 public ConsultorioDAOHibernateJPA() {
		 super(Consultorio.class);
	 }

}
