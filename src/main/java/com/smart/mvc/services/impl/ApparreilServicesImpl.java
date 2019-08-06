package com.smart.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.smart.mvc.dao.IApparreilDao;
import com.smart.mvc.entites.Apparreil;
import com.smart.mvc.services.IApparreilServices;


@Transactional
public class ApparreilServicesImpl implements IApparreilServices{
    
	private IApparreilDao dao;
	
	public void setDao(IApparreilDao Dao) {
		this.dao=dao;
	}
	
	@Override
	public Apparreil save(Apparreil entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Apparreil update(Apparreil entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Apparreil> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Apparreil getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public List<Apparreil> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Apparreil findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Apparreil findOne(String[] paramNmes, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNmes, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}

}
