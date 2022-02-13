package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

	@Query("select a from Alumno a where a.carrera = ?1")
	public Iterable<Alumno> buscarAlumnosPorCarrera(String carrera);
}
