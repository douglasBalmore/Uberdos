package com.uberdos.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uberdos.main.entities.PaTipoViaje;
import com.uberdos.main.entities.PaViaje;
import com.uberdos.main.entities.Usuario;
import com.uberdos.main.repositories.IPaTipoViajeRepository;
import com.uberdos.main.repositories.IPaViajeRepository;
import com.uberdos.main.repositories.IUsuarioRepository;

@Service
@Transactional
public class PaViajeService {
	
		@Autowired
		IPaViajeRepository rViaje;
		
		@Autowired
		IPaTipoViajeRepository rTipo;
		
		@Autowired
		IUsuarioRepository rUsu;
		
		
		public List<PaViaje> findAll(){
			List<PaViaje> lista = (List<PaViaje>) rViaje.findAll();
			return lista;	
		}
		
		public void save(PaViaje viaje) {
			 rViaje.save(viaje);
		}
		
		public void delete(Integer id) {
			rViaje.deleteById(id);
		}
		
		public List<PaTipoViaje> findAllTipoViaje(){
			List<PaTipoViaje>  lista = (List<PaTipoViaje>) rTipo.findAll();
			return lista;
		}
		
		public List<Usuario> findAllUsuario(){
			List<Usuario> listaU = (List<Usuario>) rUsu.findAll();
			return listaU;
		}
		
		
}
