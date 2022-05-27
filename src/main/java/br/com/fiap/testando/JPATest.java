package br.com.fiap.testando;

import br.com.fiap.domain.Estabelecimento;
import br.com.fiap.domain.TipoEstabelecimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("estudando-orm").createEntityManager();
			em.getTransaction().begin();
			
			Estabelecimento recuperado = em.find(Estabelecimento.class,1);
			System.out.println(recuperado);
			recuperado.setNome("Escola da Vitoria");
			em.persist(recuperado);
			em.getTransaction().commit();
			System.out.println(recuperado);
			
			TipoEstabelecimento tipo = em.find(TipoEstabelecimento.class, 1);
			System.out.println(tipo.getEstabelecimentos());
//			
//			Estabelecimento novo = new Estabelecimento();
//			novo.setNome("Escola do prof Victube");
//			
//			em.persist(novo);
//			em.getTransaction().commit();
			
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
