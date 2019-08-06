package com.smart.mvc.services;

import java.util.List;

import com.smart.mvc.entites.Apparreil;

public interface IApparreilServices {

public Apparreil save(Apparreil entity);
	
	public Apparreil update(Apparreil entity);
	
	public List<Apparreil> selectAll();
	
	public Apparreil getById(Long id);
	
	public void remove(Long id);
	
	public List<Apparreil> selectAll(String sortField,String sort);
	
	public Apparreil findOne(String paramName,Object paramValue);
	
	public Apparreil findOne(String[] paramNmes, Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	

}
