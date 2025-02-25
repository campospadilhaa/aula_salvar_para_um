package com.campospadilhaa.aula_salvar_para_um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campospadilhaa.aula_salvar_para_um.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}