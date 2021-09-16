package com.example.ev.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ventas")

public class Venta {

	//	monto_total, numero de productos, observaciones, vendedor
	@Id //id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Autoincremento
	private Long id;
	private float monto_total;
	private int numero_de_productos;
	private String observaciones;
	private String vendedor;
	//TODO usuario
	//TODO array de productos
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	//Constructores
	public Venta() {
		super();
	}

	public Venta(Long id, float monto_total, int numero_de_productos, String observaciones, String vendedor) {
		super();
		this.monto_total = monto_total;
		this.numero_de_productos = numero_de_productos;
		this.observaciones = observaciones;
		this.vendedor = vendedor;
	}
	
	//Setter-Getter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(float monto_total) {
		this.monto_total = monto_total;
	}

	public int getNumero_de_productos() {
		return numero_de_productos;
	}

	public void setNumero_de_productos(int numero_de_productos) {
		this.numero_de_productos = numero_de_productos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	//Manejo de fechas en db
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	
	
}
