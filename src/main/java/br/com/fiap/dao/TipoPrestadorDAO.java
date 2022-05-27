package br.com.fiap.dao;
import java.util.List;

import br.com.fiap.domain.Prestador;
import br.com.fiap.domain.PrestadorTipo;
import jakarta.persistence.EntityManager;

public class TipoPrestadorDAO extends GenericDAO<Prestador, Integer>{

	public TipoPrestadorDAO(EntityManager em) {
		super(em);
		
	}
	
	@Override
	public List<Prestador> listar(){
		return this.em.createQuery("from PrestadorTipo").getResultList();
		
	}
	
	public List<PrestadorTipo>listarOrdenandoNome(){
		return this.em.createQuery("from PrestadorTipo order by name").getResultList();
	}
	
	public List<PrestadorTipo> listarTresUltimos(){
		return this.em.createQuery("from PrestadorTipo order by id desc").setMaxResults(2).getResultList();
	}
	
}
