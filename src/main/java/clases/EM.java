package clases;

import javax.persistence.*;

public class EM {

	private static EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("ttps_veterinaria");
	private static EntityManager m = emf.createEntityManager();
	@PersistenceContext
	public static EntityManager getEM() {
		return m;
	}
	
	public EM() {

	}
	
}
