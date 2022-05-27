package br.com.fiap.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;

public abstract class GenericDAO<E,C> {
	protected Class<E> classeEntidade;
	protected EntityManager em;
	
	public GenericDAO(EntityManager em) {
		this.em = em;
		this.classeEntidade = (Class<E>)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public void salvar(E entidade) {
		this.em.persist(entidade);
	}
	
	public E recuperar(C chave) {
		return em.find(classeEntidade, chave);
	}
	
	public void excluir(C chave) {
		E entidadeExcluir = this.recuperar(chave);
		if (entidadeExcluir == null) {
			throw new IllegalArgumentException("Nenhum registro a ser excluido");
			}
		this.em.remove(entidadeExcluir);
	}
	
	public List<E> listar(){
		CriteriaQuery<E> query = this.em.getCriteriaBuilder().createQuery(this.classeEntidade);
		return this.em.createQuery(query.select(query.from(this.classeEntidade))).getResultList();
	}
}
