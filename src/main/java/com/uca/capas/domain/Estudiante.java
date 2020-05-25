package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {

	@Id
	@Column(name = "c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoEstudiante;

	@Column(name = "nombre")
	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message = "El nombre no debe tener mas de 50 caracteres", max = 50)
	private String nombre;

	@Column(name = "apellido")
	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message = "El apellido no debe tener mas de 50 caracteres", max = 50)
	private String apellido;

	@Column(name = "carne")
	@NotEmpty(message = "El campo no puede estar vacio")
	@Pattern(regexp = "^[0-9]{8}$", message = "El carne debe tener 8 digitos")
	private String carne;

	@Column(name = "carrera")
	@NotEmpty(message = "El campo no puede estar vacio")
	@Size(message = "La carrera no debe tener mas de 100 caracteres", max = 100)
	private String carrera;

	public Estudiante() {

	}

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
}