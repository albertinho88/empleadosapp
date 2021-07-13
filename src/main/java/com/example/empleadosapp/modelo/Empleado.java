package com.example.empleadosapp.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.empleadosapp.enumeracion.EstadoEmpleadoEnum;
import com.example.empleadosapp.enumeracion.TipoEmpleadoEnum;

import lombok.Data;

@Entity
@Table(name = "empleados")
@Data
public class Empleado implements Serializable {

	private static final long serialVersionUID = -3590294707617052047L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empleado_id")
	private Long empleadoId;
	
	@Column(nullable = false)
	private String identificacion;
	
	@Column(nullable = false)
	private String nombre;

	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private TipoEmpleadoEnum tipo;

	@Column(name = "estado")
	@Enumerated(EnumType.STRING)
	private EstadoEmpleadoEnum estado;

	@JoinColumn(name = "empleado_padre_id", referencedColumnName = "empleado_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Empleado supervisor;

	private LocalDate fechaIngreso;

	@JoinColumn(name = "departamento_id", referencedColumnName = "departamento_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Departamento departamento;
	
	@Column(nullable = false)	
	private BigDecimal sueldo;

}
