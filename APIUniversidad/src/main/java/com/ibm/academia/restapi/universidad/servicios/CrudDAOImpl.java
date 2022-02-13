package com.ibm.academia.restapi.universidad.servicios;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public class CrudDAOImpl<E, R extends CrudRepository<E, Long> > implements CrudDAO<E>
{
protected final R repository;
	
	public CrudDAOImpl(R repository)
	{
		this.repository = repository;
	}
	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E guardar(E entidad) {
		// TODO Auto-generated method stub
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Long id) {
		repository.deleteById(id);
	}

}
