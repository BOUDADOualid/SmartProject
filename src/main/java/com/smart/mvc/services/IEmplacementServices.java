package com.smart.mvc.services;

import java.util.List;

import com.smart.mvc.entites.Emplacement;

public interface IEmplacementServices {

    public Emplacement save(Emplacement entity);
	
	public Emplacement update(Emplacement entity);
	
	public List<Emplacement> selectAll();
	
	public Emplacement getById(Long id);
	
	public void remove(Long id);
	
	public List<Emplacement> selectAll(String sortField,String sort);
	
	public Emplacement findOne(String paramName,Object paramValue);
	
	public Emplacement findOne(String[] paramNmes, Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	
}
