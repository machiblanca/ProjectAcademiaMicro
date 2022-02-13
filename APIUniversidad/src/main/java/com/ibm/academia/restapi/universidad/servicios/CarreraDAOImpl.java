
package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.repositorios.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarreraDAOImpl extends CrudDAOImpl<Carrera, CarreraRepository> implements CarreraDAO {
@Autowired
	public CarreraDAOImpl(CarreraRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String Apellido) {
		return repository.buscarCarrerasPorProfesorNombreYApellido(nombre, Apellido);
	}  
    
}
