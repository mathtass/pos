package br.com.fiap.domain;
import java.util.Calendar;
import jakarta.persistence.*;
@Entity
@Table(name="PRESTADOR")
public class Prestador {
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ser_seq")
	 @SequenceGenerator(name="ser_seq", sequenceName="SERVICO_SEQ", allocationSize=1)
	 @Column(name="ID_PRESTADOR")
	 private Integer id;
	 
	 @Column(name="NOME_PRESTADOR")
	 private String nome_prestador;
	 
	 @Column(name="CIDADE")
	 private String cidade;
	 
	 @Column(name="ESTADO")
	 private String estado;
	 
	 @JoinColumn(name="ID_TIPO_PRESTADOR")
	 @ManyToOne 
	 private PrestadorTipo prestador;
	 
	 @Column(name="TELEFONE")
	 private String telefone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_prestador() {
		return nome_prestador;
	}

	public void setNome_prestador(String nome_prestador) {
		this.nome_prestador = nome_prestador;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public PrestadorTipo getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorTipo prestador) {
		this.prestador = prestador;
	}
	
	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	// Imprime todas as informações da tabela e usa a função prestador.getNome_tipo para imprimir tipo do prestador (foreign key)
	public String toString() {
		return id + " - " + nome_prestador + " - " + cidade + "-" + estado + " - " + prestador.getNome_tipo() + " - " + telefone;
	}
}
