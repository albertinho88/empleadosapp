package com.example.empleadosapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empleadosapp.modelo.Departamento;
import com.example.empleadosapp.servicio.DepartamentoServicio;

@RestController
@RequestMapping("/api/v1")
public class DepartamentoControlador {

	@Autowired
	DepartamentoServicio departamentoServicio;

	@GetMapping("/departamentos")
	public ResponseEntity<List<Departamento>> get() {
		List<Departamento> departamentos = departamentoServicio.findAll();
		return new ResponseEntity<List<Departamento>>(departamentos, HttpStatus.OK);
	}

}
