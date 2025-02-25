package com.campospadilhaa.aula_salvar_para_um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campospadilhaa.aula_salvar_para_um.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}