package com.example.empleadosapp.enumeracion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EstadoEmpleadoEnum {

	ACTIVO("ACT", "Activo"), CESANTE("CES", "Cesante");

	private String codigo;
	private String descripcion;

}
