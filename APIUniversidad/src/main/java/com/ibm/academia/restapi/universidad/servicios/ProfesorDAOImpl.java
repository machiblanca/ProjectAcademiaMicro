package com.ibm.academia.restapi.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;
import com.ibm.academia.restapi.universidad.repositorios.ProfesorRepository;

@Service
public class ProfesorDAOImpl extends CrudDAOImpl<Persona, ProfesorRepository> implements ProfesorDAO
{
@Autowired
	public ProfesorDAOImpl(ProfesorRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

@Override
public Persona guardar(Persona entidad) {
	// TODO Auto-generated method stub
	return repository.save(entidad);
}

@Override
@Transactional(readOnly = true)
public Iterable<Persona> buscaProfesoresPorCarrera(String carrera) {
	// TODO Auto-generated method stub
	return repository.buscaProfesoresPorCarrera(carrera);
}

}
