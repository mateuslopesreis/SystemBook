package com.book_system.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_livros")

public class Livro implements Serializable {
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
	
	public Livro() {

}
	
	
	public Livro(Long id, String titulo, String lancamento, Long quantidade, String autor, String genero,
			String editora) {
		this.id = id;
		this.titulo = titulo;
		this.lancamento = lancamento;
		this.quantidade = quantidade;
		this.autor = autor;
		this.genero = genero;
		this.editora = editora;
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
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj== null) {
			return false;
		}
		if(getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
