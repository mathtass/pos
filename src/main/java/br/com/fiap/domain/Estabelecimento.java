package br.com.fiap.domain;
import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
@Entity
@Table(name="TBL_ESTABELECIMENTO")
public class Estabelecimento {
 @Id
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="est_seq")
 @SequenceGenerator(name="est_seq", sequenceName="TB_ESTABELECIMENTO", allocationSize=1)
 @Column(name="ID_ESTABELECIMENTO")
 private Integer id;
 
 @Column(name="NOME_ESTABELECIMENTO")
 private String nome;
 
 @JoinColumn(name="ID_TIPO_ESTABELECIMENTO")
 @ManyToOne 
 private TipoEstabelecimento tipo;
  
 public TipoEstabelecimento getTipo() {
	return tipo;
}
public void setTipo(TipoEstabelecimento tipo) {
	this.tipo = tipo;
}

@CreationTimestamp
 @Temporal(TemporalType.TIMESTAMP)
 @Column(name="DH_ESTABELECIMENTO")
 private Calendar dataHoraCriacao;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Calendar getDataHoraCriacao() {
	return dataHoraCriacao;
}
public void setDataHoraCriacao(Calendar dataHoraCriacao) {
	this.dataHoraCriacao = dataHoraCriacao;
}

	@Override
	public String toString() {
		return id + " - " + nome + " - " + tipo.getNome();
	}
}
