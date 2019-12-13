package dao.hibernateJPA;
import dao.clases.GenericDAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import clases.EM;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {
	
	protected Class<T> persistentClass; 
	
	public Class<T> getPersistentClass(){
		return persistentClass;
	}
	
	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	public GenericDAOHibernateJPA(Class<T> clase) {
		persistentClass = clase;
	}
	
	@Override
	public void borrar(T entity) {
		EntityManager em =  EM.getEM();
		EntityTransaction etx = null;
		try {
			etx = em.getTransaction();
			etx.begin();
			em.remove(entity);
			etx.commit();
		} catch (RuntimeException e) {
			if(etx != null && etx.isActive()) etx.rollback();
			throw e;
			} finally {
				em.close();
			}
	}

	@Override
	public T actualizar (T entity) {
		EntityManager em = EM.getEM();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		entity = em.merge(entity);
		etx.commit();
		return entity;
	}
	
	@Override
	public List<T> recuperarTodos (String columnOrder){
		Query consulta = EM.getEM().createQuery("SELECT * FROM "+getPersistentClass().getSimpleName()+" e ORDER BY e."+columnOrder);
		List<T> resultado = ((List<T>)consulta.getResultList());
		return resultado;
	}
	
	@Override
	public T recuperar (Serializable id) {
		String className = getPersistentClass().getSimpleName();
		Query consulta = EM.getEM().createQuery("SELECT * FROM "+className+" e WHERE e.ID_"+className+" e."+id);
		T resultado = ((T)consulta.getSingleResult());
		return resultado;
	}

	//FALTAN HACER
	@Override
	public T borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
