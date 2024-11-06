package com.book_system.dto;

import java.io.Serializable;

import com.book_system.entities.Leitor;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LeitorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String dataCadastro;
	
	public LeitorDTO() {

	}
	

	public LeitorDTO(Leitor entity) { 
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.email = entity.getEmail();
		this.dataCadastro = entity.getDataCadastro();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}

