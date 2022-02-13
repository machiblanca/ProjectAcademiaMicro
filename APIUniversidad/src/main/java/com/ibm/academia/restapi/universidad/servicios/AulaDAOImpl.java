package com.ibm.academia.restapi.universidad.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;
import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;
@Service
public class AulaDAOImpl extends CrudDAOImpl<Aula, AulaRepository> implements AulaDAO{
@Autowired
	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly =true)
	public Iterable<Aula> buscarAulaPorTipoPizarron(TipoPizarron tipoPizarron) {
		return repository.buscarAulaPorTipoPizarron(tipoPizarron);
	}

	@Override
	@Transactional(readOnly =true)
	public Iterable<Aula> buscarAulasPorNombrePabellon(String nombre) {
		// TODO Auto-generated method stub
		return repository.buscarAulasPorNombrePabellon(nombre);
	}

	@Override
	@Transactional(readOnly =true)
	public Iterable<Aula> buscarAulaPorNumeroAula(Integer numeroAula) {
		// TODO Auto-generated method stub
		return repository.buscarAulaPorNumeroAula(numeroAula);
	}
	

}
