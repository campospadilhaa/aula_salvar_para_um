package com.campospadilhaa.aula_salvar_para_um.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campospadilhaa.aula_salvar_para_um.dto.PersonDepartmentDTO;
import com.campospadilhaa.aula_salvar_para_um.entities.Department;
import com.campospadilhaa.aula_salvar_para_um.entities.Person;
import com.campospadilhaa.aula_salvar_para_um.repositories.DepartmentRepository;
import com.campospadilhaa.aula_salvar_para_um.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public PersonDepartmentDTO insert(PersonDepartmentDTO personDepartmentDTO) {

		Person person = new Person();

		person.setName(personDepartmentDTO.getName());
		person.setSalary(personDepartmentDTO.getSalary());

		/* somente para gravar o Department no Person
		 * Department department = new Department();
		 * department.setId(personDepartmentDTO.getDepartment().getId());*/

		// buscando do banco com o id informado para que no return conste também o Department.name
		Department department = departmentRepository.getReferenceById(personDepartmentDTO.getDepartment().getId());

		person.setDepartment(department);

		person = personRepository.save(person);

		return new PersonDepartmentDTO(person);
	}
}