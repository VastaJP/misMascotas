package dao.hibernateJPA;

import modelo.Recordatorio;
import dao.clases.RecordatorioDAO;

public class RecordatorioDAOHibernateJPA extends GenericDAOHibernateJPA<Recordatorio> implements RecordatorioDAO {
		public RecordatorioDAOHibernateJPA() {
			super(Recordatorio.class);
		}
}
