package com.ibm.academia.restapi.universidad.servicios;


import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;

public interface AulaDAO extends CrudDAO<Aula>{
	public Iterable<Aula> buscarAulaPorTipoPizarron(TipoPizarron tipoPizarron);
	
	public Iterable<Aula> buscarAulasPorNombrePabellon(String nombre);

	public Iterable<Aula> buscarAulaPorNumeroAula(Integer numeroAula);

}
