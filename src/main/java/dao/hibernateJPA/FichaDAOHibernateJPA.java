package dao.hibernateJPA;

import dao.clases.FichaDAO;
import modelo.Ficha;

public class FichaDAOHibernateJPA extends GenericDAOHibernateJPA<Ficha> implements FichaDAO  {
	 public FichaDAOHibernateJPA() {
		 super(Ficha.class);
	 }
}
