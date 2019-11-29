package clases;


import java.util.List;

import javax.persistence.EntityManager;
import modelo.Usuario;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Prueba {
	
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ttps_veterinaria");
		EntityManager em = emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		
		
		//List<Usuario> usuarios=(List<Usuario>)(em.createNativeQuery("SELECT * FROM usuarios")).getResultList();
		//System.out.print(usuarios);
		
		Query query = em.createNamedQuery("usuarios.findAll");
		List<Object[]> usuarios = query.getResultList();
		//System.out.println(usuarios.get(0)[1]);
		for (Object[] usuario : usuarios) {
			 System.out.println( "Nombre: " + usuario[1] + ", Apellido: " + usuario[2] + ", Telefono: " + usuario[3] + ", email: " + usuario[4]);
		}
		
		em.close();

	}
	
}
