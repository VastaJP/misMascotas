package dao.hibernateJPA;

import dao.clases.EventoAtencionDAO;
import modelo.EventoAtencion;

public class EventoAtencionDAOHibernateJPA extends GenericDAOHibernateJPA<EventoAtencion> implements EventoAtencionDAO {
	 public EventoAtencionDAOHibernateJPA() {
		 super(EventoAtencion.class);
	 }
}

