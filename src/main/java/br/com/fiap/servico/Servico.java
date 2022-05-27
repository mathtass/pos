package br.com.fiap.servico;

import br.com.fiap.dao.PrestadorDAO;
import br.com.fiap.dao.TipoPrestadorDAO;
import br.com.fiap.domain.Prestador;
import br.com.fiap.domain.PrestadorTipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
public class Servico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("estudando-orm").createEntityManager();
			PrestadorDAO dao = new PrestadorDAO(em);
			em.getTransaction().begin();
			
			//PrestadorTipo novoTipo = new PrestadorTipo();
			//novoTipo.setNome_tipo("Tercerizado");
			
			//dao.salvar(novoTipo);
			
			//PrestadorTipo recuperado = dao.recuperar(3);
			//System.out.println(recuperado);
			
			
			System.out.println("\n\n Lista Telefonica:");
			for(Prestador entidade:dao.listar()) {
				System.out.println(entidade);	
			}
			
			
			
			
			em.getTransaction().commit();
//			Prestador primeiro = em.find(Prestador.class,1);	
//			Prestador segundo = em.find(Prestador.class,2);
//			System.out.println(primeiro);
//			System.out.println(segundo);
		

	}catch(Exception e) {
		if(em!=null && em.getTransaction().isActive()) {
		}
	}finally {
		if(em!= null) {
			em.close();
			}
	}
	System.exit(0);

}}
