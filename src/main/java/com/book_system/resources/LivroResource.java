package com.book_system.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.book_system.services.LivroService;


import com.book_system.dto.LivroDTO;


@RestController
@RequestMapping(value= "/livro")
public class LivroResource {
	
	@Autowired
	private LivroService service;
	
	@GetMapping()
	public ResponseEntity<List<LivroDTO>>findAll(){
		List<LivroDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<LivroDTO>findById(@PathVariable Long id){
		LivroDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<LivroDTO> insert(@RequestBody LivroDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(dto.getId())
				.toUri();
		
		return ResponseEntity.created(uri).body(null);

	}
	

}


	
	
	
