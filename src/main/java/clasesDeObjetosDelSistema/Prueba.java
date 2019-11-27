package clasesDeObjetosDelSistema;

import javax.persistence.EntityManager;
import modelo.Usuario;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Prueba {
	
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ttps_veterinaria");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		
		Usuario u = new Usuario();
		u.setNombre("Manuel");
		u.setApellido("Amante");
		u.setEmail("emaildemanu@gmail.com");
		u.setTelefono("5496382");
		
		em.persist(u);
		
		etx.commit();
		em.close();

	}
	
}
