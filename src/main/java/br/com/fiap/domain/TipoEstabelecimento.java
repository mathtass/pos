package br.com.fiap.domain;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TIPO_ESTABELECIMENTO")
public class TipoEstabelecimento {


	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo_est_seq")
	 @Column(name="ID_TIPO_ESTABELECIMENTO")
	 private Integer id;
	

	@Column(name="NOME_TIPO_ESTABELECIMENTO")
	private String nome;
	
	@OneToMany(mappedBy="tipo")
	private Collection<Estabelecimento> estabelecimentos;
	
	
	public Integer getId() {
	return id;}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Collection<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(Collection<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}
}
