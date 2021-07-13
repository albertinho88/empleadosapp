package com.example.empleadosapp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empleadosapp.modelo.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {

}
