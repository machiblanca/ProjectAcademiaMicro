package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;

@Repository("repositoriopabellon")
public interface PabellonRepository extends CrudRepository<Pabellon, Long>
{
	@Query("select p from Pabellon p where p.direccion.localidad = ?1")
	public Iterable<Pabellon> buscarPabellonPorLocalidad(String localidad);
	
	@Query("select p from Pabellon p where p.nombre = ?1")
	public Iterable<Pabellon> buscarPabellonPorNombre(String nombre);
	
}
