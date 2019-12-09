package com.uberdos.main.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uberdos.main.entities.PaViaje;

@Repository
public interface IPaViajeRepository extends CrudRepository<PaViaje, Integer>{
		
}
