package com.example.empleadosapp.enumeracion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TipoEmpleadoEnum {

	EMPLEADO("EMP", "Empleado"), SUPERVISOR("SUP", "Supervisor");

	private String codigo;
	private String descripcion;

}
