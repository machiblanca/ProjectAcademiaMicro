package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

public interface ProfesorDAO extends CrudDAO<Persona> {
	public Iterable<Persona> buscaProfesoresPorCarrera(String carrera);

}
