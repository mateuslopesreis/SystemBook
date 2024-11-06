package com.book_system.dto;

import java.io.Serializable;

import com.book_system.entities.Livro;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LivroDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String lancamento;
	private Long quantidade;
	private String autor;
	private String genero;
	private String editora;
	
	public LivroDTO() {

	}
	

	public LivroDTO(Livro entity) { 
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.lancamento = entity.getLancamento();
		this.quantidade = entity.getQuantidade();
		this.autor = entity.getAutor();
		this.genero = entity.getGenero();
		this.editora = entity.getEditora();

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getLancamento() {
		return lancamento;
	}


	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}


	public Long getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
}
