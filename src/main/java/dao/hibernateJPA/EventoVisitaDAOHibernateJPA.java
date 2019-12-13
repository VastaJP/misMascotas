package dao.hibernateJPA;

import dao.clases.EventoVisitaDAO;
import modelo.EventoVisita;

public class EventoVisitaDAOHibernateJPA extends GenericDAOHibernateJPA<EventoVisita> implements EventoVisitaDAO {
	 public EventoVisitaDAOHibernateJPA() {
		 super(EventoVisita.class);
	 }
}
