package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Empleado;

@Repository												//Nombre y tipo de pk
public interface EmpleadoRepository extends CrudRepository<Empleado,Long>{

	//Interacion con la base de datos

	//Metodos que heredaremos de otras clases (CRUD Y JPA)
	
	List<Empleado> findAll();
	
}
