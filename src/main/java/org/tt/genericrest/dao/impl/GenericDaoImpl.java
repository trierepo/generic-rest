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
public abstract class GenericDaoImpl<T extends AbstractEntity> implements IGenericDao<T> {

	@Autowired
    private SessionFactory sessionFactory;
	
	protected Class<? extends T> entityType;
	
	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityType = (Class<T>) pt.getActualTypeArguments()[0];
    }

	public T save(T model) {
		if (model.getId() == null) {
			Long id = (Long) sessionFactory.getCurrentSession().save(model);
			model.setId(id);
		} else {
			sessionFactory.getCurrentSession().update(model);
		}
		return model;
	}

	@SuppressWarnings("unchecked")
	public T find(Long id) {
		return (T) sessionFactory.getCurrentSession().get(entityType, (Serializable) id);
	}

	@SuppressWarnings("unchecked")
	public List<T> find() {
		return sessionFactory.getCurrentSession().createCriteria(entityType).list();
	}

	public int delete(Long id) {
		return sessionFactory.getCurrentSession()
			.createQuery("delete from " + entityType.getSimpleName() + " where id = " + id)
			.executeUpdate();
	}
}
