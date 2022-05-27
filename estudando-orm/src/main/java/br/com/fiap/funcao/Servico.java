package br.com.fiap.funcao;

import br.com.fiap.domain.Prestador;
import br.com.fiap.domain.Prestador_Tipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Servico {
	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("estudando-orm").createEntityManager();
			em.getTransaction().begin();
			Prestador a = em.find(Prestador.class,1);
			System.out.println(a);
			em.persist(a);
			em.getTransaction().commit();
		}catch(Exception e) {
			if(em!=null && em.getTransaction().isActive()) {
			}
		}finally {
			if(em!= null) {
				em.close();
				}
		}
		System.exit(0);
	}
}

