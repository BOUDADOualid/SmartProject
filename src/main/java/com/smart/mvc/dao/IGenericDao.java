package com.smart.mvc.dao;

import java.util.List;

public interface IGenericDao<E> {

	public E save(E entity);
	
	public E update(E entity);
	
	public List<E> selectAll();
	
	public E getById(Long id);
	
	public void remove(Long id);
	
	public List<E> selectAll(String sortField,String sort);
	
	public E findOne(String paramName,Object paramValue);
	
	public E findOne(String[] paramNmes, Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	
	
}