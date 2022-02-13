package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends CrudRepository<Persona, Long> {
	
	@Query("select p from Profesor p where p.carrera = ?1")
	public Iterable<Persona> buscaProfesoresPorCarrera(String carrera);
	}
