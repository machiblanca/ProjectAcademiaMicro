package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

public interface EmpleadoDAO extends CrudDAO<Persona>
{
	public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(TipoEmpleado  tipoEmpleado);

}
