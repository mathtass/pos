package br.com.fiap.domain;
import java.util.Calendar;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name="USUARIO")
public class Usuario {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usu_seq")
	 @SequenceGenerator(name="usu_seq", sequenceName="TB_USUARIO", allocationSize=1)
	 @Column(name="ID_USUARIO")
	 private Integer id;

	 
	 @Column(name="NOME_USUARIO")
	 private String nome;
	 @Column(name="SENHA_USUARIO")
	 private String senha;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	 
	
	 
	 

	 
	 
}
