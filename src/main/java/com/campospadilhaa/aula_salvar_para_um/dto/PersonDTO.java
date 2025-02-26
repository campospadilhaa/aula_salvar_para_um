package com.campospadilhaa.aula_salvar_para_um.dto;

import java.util.Objects;

import com.campospadilhaa.aula_salvar_para_um.entities.Person;

public class PersonDTO {

	private Long id;
	private String name;
	private Double salary;
	private Long departmentId;

	public PersonDTO() {
		
	}

	public PersonDTO(Long id, String name, Double salary, Long departmentId) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}
 
	public PersonDTO(Person person) {

		this.id = person.getId();
		this.name = person.getName();
		this.salary = person.getSalary();
		this.departmentId = person.getDepartment().getId();
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

	public Long getDepartmentId() {
		return departmentId;
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

		PersonDTO other = (PersonDTO) obj;

		return Objects.equals(id, other.id);
	}
}