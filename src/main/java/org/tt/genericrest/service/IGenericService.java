package org.tt.genericrest.service;

import java.util.List;

public interface IGenericService<T, ID> {
	public T save(T model);

	public T find(ID id);

	public List<T> find();

	public Boolean delete(ID id);
}
