package com.campospadilhaa.aula_salvar_para_um.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.campospadilhaa.aula_salvar_para_um.dto.PersonDTO;
import com.campospadilhaa.aula_salvar_para_um.services.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonController {

	@Autowired
	private PersonService personService;

	/*
	@PostMapping
	public ResponseEntity<PersonDepartmentDTO> insert(@RequestBody PersonDepartmentDTO personDepartmentDTO) { // anotation '@Valid' considera as validações definidas no DTO

		personDepartmentDTO = personService.insert(personDepartmentDTO);

		// a criação de uma URI faz com que no header do response conste a URL para a busca do Person
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(personDepartmentDTO.getId()).toUri();

		// ResponseEntity com 'created' retorna o status 201 (created)
		return ResponseEntity.created(uri).body(personDepartmentDTO);
	}*/

	@PostMapping
	public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO personDTO) { // anotation '@Valid' considera as validações definidas no DTO

		personDTO = personService.insert(personDTO);

		// a criação de uma URI faz com que no header do response conste a URL para a busca do Person
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(personDTO.getId()).toUri();

		// ResponseEntity com 'created' retorna o status 201 (created)
		return ResponseEntity.created(uri).body(personDTO);
	}
}