package com.example.empleadosapp.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empleadosapp.servicio.EmpleadoServicio;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoControlador {

	@Autowired
	EmpleadoServicio empleadoServicio;
	
	
	
}
