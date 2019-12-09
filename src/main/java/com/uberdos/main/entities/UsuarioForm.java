package com.uberdos.main.entities;

import java.util.Date;

/*
 * Nombre de la clase: UsuarioForm
 * Fecha: 3/11/2019
 * Versión: 1.0
 * CopyRight: 
 * Autor: Téc. Balmore Pérez
 */
public class UsuarioForm {
	
	//Atributos de la clase
	private Long id;
	private String name;	
	private String apellido;
	private String dui;
	private Date fecha;
	private String direccion;
	private String telefono;
	private String email;
	private String password;
	private String sexo;
	private String biografia;
	private String tipo;
	
	//Métodos constructores
	public UsuarioForm() {
		
	}
	
	public UsuarioForm(String name, String apellido, String dui, Date fecha, String direccion, String telefono, String email, String password, 
			String sexo, String biografia, String tipo)
	{
		this.name = name;
		this.apellido = apellido;
		this.dui = dui;
		this.fecha = fecha;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.password = password;
		this.sexo = sexo;
		this.biografia = biografia;
		this.tipo = tipo;
	}
	
	//Métodos Getter y Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}