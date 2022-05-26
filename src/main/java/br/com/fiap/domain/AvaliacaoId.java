package br.com.fiap.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable //chave composta 
public class AvaliacaoId {

	
	@Column(name="ID_USUARIO")
	private Integer usuarioId;
	@Column(name="ID_ESTABELECIMENTO")
	private Integer estabelecimentoId;
	
	
	
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Integer getEstabelecimentoId() {
		return estabelecimentoId;
	}
	public void setEstabelecimentoId(Integer estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(estabelecimentoId, usuarioId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId other = (AvaliacaoId) obj;
		return Objects.equals(estabelecimentoId, other.estabelecimentoId) && Objects.equals(usuarioId, other.usuarioId);
	}
	
	
	
}
