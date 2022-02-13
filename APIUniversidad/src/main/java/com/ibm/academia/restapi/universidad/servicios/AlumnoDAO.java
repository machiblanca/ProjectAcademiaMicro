package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;

public interface AlumnoDAO extends CrudDAO<Alumno>
{
	public Iterable<Alumno> buscarAlumnosPorCarrera(String carrera);
}
