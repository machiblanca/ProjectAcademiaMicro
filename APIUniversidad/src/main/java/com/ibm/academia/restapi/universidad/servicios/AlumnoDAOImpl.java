package com.ibm.academia.restapi.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.universidad.modelo.entidades.Alumno;
import com.ibm.academia.restapi.universidad.repositorios.AlumnoRepository;
@Service
public class AlumnoDAOImpl extends CrudDAOImpl<Alumno, AlumnoRepository> implements AlumnoDAO{

@Autowired
	public AlumnoDAOImpl(AlumnoRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Alumno> buscarAlumnosPorCarrera(String carrera) {
		return repository.buscarAlumnosPorCarrera(carrera);
	}

}
