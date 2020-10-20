package com.ecodeup.articulos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo {
	private int id;
	private String codigo;
	private String nombre;
	private String descripcion;
	private double existencia;
	private double precio;
	

	
}