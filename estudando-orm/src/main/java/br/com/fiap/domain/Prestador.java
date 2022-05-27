package br.com.fiap.domain;

import jakarta.persistence.*;

@Entity
@Table(name="SERVICO")
public class Prestador {
	// Campos do DB: ID, Prestador, Telefone, Endereço, Cidade
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sch_seq")
	@SequenceGenerator(name="sch_seq", sequenceName="SERVICO_SEQ", allocationSize=1)
	
	@Column(name="ID")
	private Integer id;
	
	@Column(name="PRESTADOR")
	private String prestador_nome;
	
	@Column(name="TELEFONE")
	private Integer tel;
	
	@Column(name="ENDERECO")
	private String endereço;
	
	@Column(name="CIDADE")
	private String cidade;

	/*
	 * @JoinColumn(name="ID_TIPOSERVICO")
	 * 
	 * @ManyToOne private Prestador_Tipo prestador;
	 * 
	 * public Prestador_Tipo getPrestador() { return prestador; } public void
	 * setPrestador(Prestador_Tipo prestador) { this.prestador = prestador; }
	 */
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrestador_nome() {
		return prestador_nome;
	}
	public void setPrestador_nome(String prestador_nome) {
		this.prestador_nome = prestador_nome;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return id + "-" + prestador_nome;
	}
	

}
