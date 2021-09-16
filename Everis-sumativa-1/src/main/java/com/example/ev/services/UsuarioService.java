package com.example.ev.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.example.ev.models.Usuario;
import com.example.ev.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	//Traer el repository
	private final UsuarioRepository er;  
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.er = usuarioRepository;
	}
	
	public Usuario crearUsuario(@Valid Usuario usuario) {
	    return er.save(usuario);
	}

	public List<Usuario> findAll() {
	    return er.findAll();
	}

	public void eliminarUsuario(Long id) {
	    er.deleteById(id);
	}

	public Usuario buscarUsuario(Long id) {
	    Optional<Usuario> oUsuario = er.findById(id); //Manejo del optional
	    if(oUsuario.isPresent()) {
	        return oUsuario.get();
	    }
	    else {
	        return null;
	    }
	}

	public void modificarUsuario(@Valid Usuario usuario) {
	    er.save(usuario);
	}

	
	
}
