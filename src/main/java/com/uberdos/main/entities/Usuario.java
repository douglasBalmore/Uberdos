package com.uberdos.main.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Nombre de la clase: Usuario
 * Fecha: 3/11/2019
 * Versión: 1.0
 * CopyRight: 
 * Autor: Téc. Balmore Pérez
 */

@Entity
@Table(name = "pa_usuario")
public class Usuario {
	
	//Atributos de la clase
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
    private Long id;

    @Column(name = "nom_usuario")
    private String name;
    
    @Column(name = "ape_usuario")
    private String apellido;
    
    @Column(name = "dui_usuario")
    private String dui;
    
    @Column(name = "fec_usuario")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name = "dir_usuario")
    private String direccion;
    
    @Column(name = "tel_usuario")
    private String telefono;
    
    @Column(name = "cor_usuario")
    private String email;
    
    @Column(name = "pas_usuario")
    private String password;
    
    @Column(name = "sex_usuario")
    private String sexo;
    
    @Column(name = "bio_usuario")
    private String biografia;
    
    @Column(name = "est_usuario")
    private boolean enabled;
    
    @Column(name = "tip_usuario")
    private String tipo;
    
    //Métodos constructores
    public Usuario(){}

    public Usuario(String name, String apellido, String dui, Date fecha, String direccion, String telefono, String email, String password, 
    		String sexo, boolean enabled, String tipo) {
        this.name = name;
        this.apellido = apellido;
        this.dui = dui;
        this.fecha = fecha;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.sexo = sexo;
        this.enabled = enabled;
        this.tipo = tipo;
    }
    
    public Usuario(Long id, String name, String apellido, String dui, Date fecha, String direccion, String telefono, String email, 
    		String sexo, String biografia, boolean enabled, String tipo) {
    	this.name = name;
        this.apellido = apellido;
        this.dui = dui;
        this.fecha = fecha;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.sexo = sexo;
        this.biografia = biografia;
        this.enabled = enabled;
        this.tipo = tipo;
    }

    //Methods Getter and Setter
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

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}