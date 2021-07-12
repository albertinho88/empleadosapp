package com.example.empleadosapp.enumeracion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EstadoRegistroEnum {

	ACTIVO("A", "Activo"), INACTIVO("I", "Inactivo"), ELIMINADO("E", "Eliminado");

	private String codigo;
	private String descripcion;

}
