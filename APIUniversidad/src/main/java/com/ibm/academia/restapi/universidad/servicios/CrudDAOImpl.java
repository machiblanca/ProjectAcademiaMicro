package com.ibm.academia.restapi.universidad.servicios;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CrudDAOImpl<E, R extends CrudRepository<E, Long> > implements CrudDAO<E>
{
protected final R repository;
	@Autowired
	public CrudDAOImpl(R repository)
	{
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly =true)
	public Optional<E> buscarPorId(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E guardar(E entidad) {
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly =true)
	public Iterable<E> buscarTodos() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		repository.deleteById(id);		
	}


}
