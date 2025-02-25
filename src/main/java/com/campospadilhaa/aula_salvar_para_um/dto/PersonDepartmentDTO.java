package com.campospadilhaa.aula_salvar_para_um.dto;

import java.util.Objects;

import com.campospadilhaa.aula_salvar_para_um.entities.Person;

public class PersonDepartmentDTO {

	private Long id;
	private String name;
	private Double salary;

	// não se deve criar uma entidade dentro do DTO. Fura a arquitetura. Deve-se criar também um DTO
	// private Department department
	private DepartmentDTO department;

	public PersonDepartmentDTO() {
		
	}

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO departmentDTO) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = departmentDTO;
	}

	public PersonDepartmentDTO(Person person) {

		this.id = person.getId();
		this.name = person.getName();
		this.salary = person.getSalary();

		DepartmentDTO departmentDTO = new DepartmentDTO(person.getDepartment());
		this.department = departmentDTO;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		PersonDepartmentDTO other = (PersonDepartmentDTO) obj;

		return Objects.equals(id, other.id);
	}
}