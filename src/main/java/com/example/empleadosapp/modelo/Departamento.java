package com.example.empleadosapp.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "departamentos")
@Data
public class Departamento implements Serializable {

	private static final long serialVersionUID = 488345117087993340L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "departamento_id")
	private Long departamentoId;

	@Column(nullable = false)
	private String nombre;

	private String descripcion;

	private String estado;

}
