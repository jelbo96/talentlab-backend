package com.example.ev.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ev.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	List<Usuario> findAll();
	
}




