package com.ibm.academia.restapi.universidad.servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.universidad.modelo.entidades.Pabellon;
import com.ibm.academia.restapi.universidad.repositorios.PabellonRepository;

@Service
public class PabellonDAOImpl extends CrudDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO
{
@Autowired
	public PabellonDAOImpl(PabellonRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterable<Pabellon> buscarPabellonPorLocalidad(String localidad) {
		return repository.buscarPabellonPorLocalidad(localidad);
	}

	@Override
	public Iterable<Pabellon> buscarPabellonPorNombre(String nombre) {
		return repository.buscarPabellonPorNombre(nombre);
	}

}
