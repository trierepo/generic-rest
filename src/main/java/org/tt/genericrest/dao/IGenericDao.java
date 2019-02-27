package org.tt.genericrest.dao;

import java.util.List;

public interface IGenericDao<T, ID> {
	public T save(T model);

	public T find(ID id);

	public List<T> find();

	public Boolean delete(ID id);
}
