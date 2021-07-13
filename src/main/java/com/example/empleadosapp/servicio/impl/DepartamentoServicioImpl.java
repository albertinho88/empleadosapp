package com.example.empleadosapp.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empleadosapp.modelo.Departamento;
import com.example.empleadosapp.repositorio.DepartamentoRepositorio;
import com.example.empleadosapp.servicio.DepartamentoServicio;

@Service
public class DepartamentoServicioImpl implements DepartamentoServicio {

	@Autowired
	DepartamentoRepositorio departamentoRepositorio;

	public List<Departamento> findAll() {
		return departamentoRepositorio.findAll();
	}

}
