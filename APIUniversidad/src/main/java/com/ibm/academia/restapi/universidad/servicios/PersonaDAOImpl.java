package com.ibm.academia.restapi.universidad.servicios;
import com.ibm.academia.restapi.universidad.repositorios.PersonaRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.modelo.entidades.Persona;

@Service
public class PersonaDAOImpl extends CrudDAOImpl<Persona, PersonaRepository> implements PersonaDAO
{
@Autowired
	public PersonaDAOImpl(PersonaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
		return repository.buscarPorNombreYApellido(nombre, apellido);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Persona> buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return repository.buscarPorDni(dni);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarPersonaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return repository.buscarPersonaPorApellido(apellido);
	}

}
