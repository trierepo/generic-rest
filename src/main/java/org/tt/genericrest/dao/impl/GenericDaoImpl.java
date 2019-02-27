package org.tt.genericrest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tt.genericrest.dao.IGenericDao;
import org.tt.genericrest.entity.AbstractEntity;

@Repository

public abstract class GenericDaoImpl<T extends AbstractEntity, ID extends Serializable> implements IGenericDao<T, ID> {

	@Autowired
    private SessionFactory sessionFactory;
	
	protected Class<? extends T> daoType;
	
	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class<T>) pt.getActualTypeArguments()[0];
    }

	@SuppressWarnings("unchecked")
	public T save(T model) {
		if (model.getId() == null) {
			ID id = (ID) sessionFactory.getCurrentSession().save(model);
			model.setId(id);
		}
		return null;
	}

	public T find(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(ID id) {
		// TODO Auto-generated method stub
		return null;
	}
}
