package com.ibm.academia.restapi.universidad.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;

@Repository("repositorioaula")
public interface AulaRepository extends CrudRepository<Aula, Long>{
	
	@Query("select a from Aula a where a.tipoPizarron = ?1")
	public Iterable<Aula> buscarAulaPorTipoPizarron(TipoPizarron tipoPizarron);
	

	@Query("select p from Pabellon p where p.nombre = ?1")
	public Iterable<Aula> buscarAulasPorNombrePabellon(String nombre);
	
	@Query("select a from Aula a where a.numeroAula = ?1")
	public Iterable<Aula> buscarAulaPorNumeroAula(Integer numeroAula);
}
