package com.belval.pizzaria;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Integer id;
	@Column(name = "nm_usuario")
	private String nome;
	@Column(name = "email_usuario")
	private String email;
	@Column(name = "senha_usuario")
	private String senha;
	@Column(name = "nivel_acesso")
	private Integer nivelAcesso;
	@Column(name = "data_cadastro")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataCadastro;
	@Column(name = "status_usuario")
	private String status;

	public Usuario(Integer id, String nome, String email, String senha, Integer nivelAcesso, Date dataCadastro,
			String status) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
		this.dataCadastro = dataCadastro;
		this.status = status;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getnivelAcesso() {
		return nivelAcesso;
	}

	public void setnivelAcesso(Integer nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCadastro, email, id, nivelAcesso, nome, senha, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nivelAcesso, other.nivelAcesso)
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", nivelAcesso="
				+ nivelAcesso + ", dataCadastro=" + dataCadastro + ", status=" + status + "]";
	}

}
