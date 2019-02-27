package org.tt.genericrest.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.tt.genericrest.dao.IGenericDao;
import org.tt.genericrest.service.IGenericService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public abstract class GenericServiceImpl<T> implements IGenericService<T> {

	private IGenericDao<T> genericDao;

	public GenericServiceImpl(IGenericDao<T> genericDao) {
		this.genericDao = genericDao;
	}

	public T save(T model) {
		return genericDao.save(model);
	}

	public T find(Long id) {
		return genericDao.find(id);
	}

	public List<T> find() {
		return genericDao.find();
	}

	public int delete(Long id) {
		return genericDao.delete(id);
	}
}
