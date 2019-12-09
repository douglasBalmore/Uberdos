package com.uberdos.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uberdos.main.entities.Usuario;;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);
}
