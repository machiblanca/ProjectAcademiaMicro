package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

public interface PabellonDAO extends CrudDAO<Pabellon>
{
	public Iterable<Pabellon> buscarPabellonPorLocalidad(String localidad);
	public Iterable<Pabellon> buscarPabellonPorNombre(String nombre);
}
