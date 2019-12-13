package dao.hibernateJPA;

import dao.clases.MascotaDAO;
import modelo.Mascota;

public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO{

		public MascotaDAOHibernateJPA() {
			super(Mascota.class);
		}
}
