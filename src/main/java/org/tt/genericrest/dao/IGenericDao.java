package org.tt.genericrest.dao;

import java.util.List;

public interface IGenericDao<T> {
	public T save(T entity);

	public T find(Long id);

	public List<T> find();

	public int delete(Long id);
}
