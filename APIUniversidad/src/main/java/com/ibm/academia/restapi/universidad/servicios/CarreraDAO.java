package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;

public interface CarreraDAO extends CrudDAO<Carrera>
{
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String Apellido);

}