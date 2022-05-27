package br.com.fiap.domain;

import java.util.Collection;

import jakarta.persistence.*;

@Entity
@Table(name="TIPO_SERVICO")
public class Prestador_Tipo {
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo_sch_seq")
	 
	 @Column(name="ID_TIPOSERVICO")
	 private Integer id;
	 
	 @Column(name="NOME_SERVICO")
	 private String nome_servico;
	 
	 @OneToMany(mappedBy="prestador")
	 private Collection<Prestador> prestador;
	 
	 public Integer getId() {
		return id;
		}
	 
	 public void setId(Integer id) {
		this.id = id;
		}
	 
	 public String getNome_servico() {
		return nome_servico;
		}
	 
	 public void setNome_servico(String nome_servico) {
		this.nome_servico = nome_servico;
		}
	 
	 public Collection<Prestador> getPrestador() {
		return prestador;
		}
	 
	 public void setPrestador(Collection<Prestador> prestador) {
		this.prestador = prestador;
		}

	
}


