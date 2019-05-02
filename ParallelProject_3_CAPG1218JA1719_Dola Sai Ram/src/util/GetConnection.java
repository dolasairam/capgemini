package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {
	static EntityManagerFactory emf;
	static EntityManager em;
	static
	{
		emf=Persistence.createEntityManagerFactory("sairam");
		em=emf.createEntityManager();
	}
	public static EntityManager getConnection()
	{
		return em;
	}

}
