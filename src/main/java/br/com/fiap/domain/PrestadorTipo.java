package br.com.fiap.domain;
import java.util.Collection;

import jakarta.persistence.*;
@Entity
@Table(name="PRESTADOR_TIPO")
public class PrestadorTipo {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo_seq")
	 @SequenceGenerator(name="tipo_seq", sequenceName="TIPO_SEQ", allocationSize=1)
	 @Column(name="ID_TIPO_PRESTADOR")
	 private Integer id_tipo;
	 
	 @Column(name="NOME_TIPO_PRESTADOR")
	 private String nome_tipo;

	@OneToMany(mappedBy="prestador")
	private Collection<Prestador> prestador;

	public Integer getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNome_tipo() {
		return nome_tipo;
	}

	public void setNome_tipo(String nome_tipo) {
		this.nome_tipo = nome_tipo;
	}

	public Collection<Prestador> getPrestador() {
		return prestador;
	}

	public void setPrestador(Collection<Prestador> prestador) {
		this.prestador = prestador;
	}
	
	@Override
	public String toString() {
		return id_tipo + " - " + nome_tipo;
	}
		
}
