package com.book_system.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.book_system.entities.Livro;
import com.book_system.dto.LivroDTO;


import com.book_system.repositories.LivroRepository;





@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	@Transactional(readOnly = true) 
	
	public List<LivroDTO>findAll(){
		List<Livro> lista = repository.findAll();
		
		return lista.stream().map(x ->  new LivroDTO(x)).collect(Collectors.toList());
	}
	
	
	@Transactional(readOnly = true)
	public LivroDTO findById(Long id) {
		Optional<Livro> obj = repository.findById(id);
		Livro entity = obj.get();
		return new LivroDTO(entity);
	}
	
	
	@Transactional
	public LivroDTO insert(LivroDTO dto) {
		Livro entity = new Livro();
		entity.setTitulo(dto.getTitulo());
		entity.setLancamento(dto.getLancamento());
		entity.setQuantidade(dto.getQuantidade());
		entity.setAutor(dto.getAutor());
		entity.setGenero(dto.getGenero());
		entity.setEditora(dto.getEditora());


		
		entity = repository.save(entity);
		
		return new LivroDTO(entity);
	}
	

}













