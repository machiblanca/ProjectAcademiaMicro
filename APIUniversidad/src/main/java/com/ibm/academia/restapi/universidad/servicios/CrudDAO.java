package com.ibm.academia.restapi.universidad.servicios;
import java.util.Optional;

/*
 * Metedos crud para todas las clases
 * E es el nombre de entidad
 * @author Blancadeli
 * */
public interface CrudDAO<E>{
	public Optional<E> buscarPorId(Long id);
	public E guardar(E Entidad);
	public Iterable<E> buscarTodos();
	public void eliminarPorId(Long id);
}
