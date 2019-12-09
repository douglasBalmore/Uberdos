package com.uberdos.main.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pa_viaje")
public class PaViaje {
	
	//Atributos de la clase Viaje
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viaje")
	private Integer id;
	
	@Column(name = "pun_par_viaje")
	private String partida;
	
	@Column(name = "pun_des_viaje")
	private String destino;
	
	@Column(name = "hor_par_viaje")
	private Time hpartida;
	
	@Column(name = "hor_ret_viaje")
	private Time hdestino;
	
	@Column(name = "precio_viaje")
	private double precio;
	
	@Column(name = "est_viaje")
	private boolean estado;
	
	@JoinColumn(name = "tipo_viaje_id")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private PaTipoViaje id_tipo;
	
	@JoinColumn(name = "usuario_id")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Usuario id_usuario;

	
	//Getter and Setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Time getHpartida() {
		return hpartida;
	}

	public void setHpartida(Time hpartida) {
		this.hpartida = hpartida;
	}

	public Time getHdestino() {
		return hdestino;
	}

	public void setHdestino(Time hdestino) {
		this.hdestino = hdestino;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public PaTipoViaje getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(PaTipoViaje id_tipo) {
		this.id_tipo = id_tipo;
	}

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

}
