package com.example.ev.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ev.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
	List<Producto> findAll();
}
