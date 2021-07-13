package com.example.empleadosapp.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empleadosapp.modelo.Empleado;
import com.example.empleadosapp.repositorio.EmpleadoRepositorio;
import com.example.empleadosapp.servicio.EmpleadoServicio;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

	@Autowired
	EmpleadoRepositorio empleadoRepositorio;

	public List<Empleado> findAll() {
		return empleadoRepositorio.findAll();
	}

}
