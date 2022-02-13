package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long>
{
	@Query("select p from Profesor p join fetch p.carrera c  where p.nombre = ?1 and p.apellido = ?1")
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String Apellido);

}