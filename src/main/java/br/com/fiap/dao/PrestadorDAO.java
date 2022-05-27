package br.com.fiap.dao;
import java.util.List;

import br.com.fiap.domain.Prestador;
import br.com.fiap.domain.PrestadorTipo;
import jakarta.persistence.EntityManager;

public class PrestadorDAO extends GenericDAO<Prestador, Integer> {
	public PrestadorDAO(EntityManager em) {
		super(em);
		
	}
	
	@Override
	public List<Prestador> listar(){
		return this.em.createQuery("from Prestador").getResultList();
		
	}
	
	public List<Prestador>listarOrdenandoNome(){
		return this.em.createQuery("from Prestador order by name").getResultList();
	}
	
	public List<Prestador> listarTresUltimos(){
		return this.em.createQuery("from Prestador order by id desc").setMaxResults(2).getResultList();
	}
}
