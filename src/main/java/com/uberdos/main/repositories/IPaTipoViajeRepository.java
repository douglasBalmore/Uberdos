package com.uberdos.main.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uberdos.main.entities.PaTipoViaje;

@Repository
public interface IPaTipoViajeRepository extends CrudRepository<PaTipoViaje, Integer>{

}
