package com.ibm.academia.restapi.universidad.servicios;
import com.ibm.academia.restapi.universidad.repositorios.EmpleadoRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.universidad.enumeradores.TipoEmpleado;
import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
@Service
public class EmpleadoDAOImpl extends CrudDAOImpl<Persona, EmpleadoRepository> implements EmpleadoDAO{
@Autowired
	public EmpleadoDAOImpl(EmpleadoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

@Override
@Transactional(readOnly = true)
public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(TipoEmpleado tipoEmpleado) {
	// TODO Auto-generated method stub
	return repository.buscarEmpleadoPorTipoEmpleado(tipoEmpleado);
}

	
}
