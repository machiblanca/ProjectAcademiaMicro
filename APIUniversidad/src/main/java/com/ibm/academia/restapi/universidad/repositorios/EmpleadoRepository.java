package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Repository("repositorioempleado")
public interface EmpleadoRepository extends CrudRepository<Persona, Long>{
	@Query("select e from Empleado e where e.tipoEmpleado = ?1")
	public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(TipoEmpleado  tipoEmpleado);
	
}
