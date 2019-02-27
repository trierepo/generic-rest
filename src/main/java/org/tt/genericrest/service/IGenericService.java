package org.tt.genericrest.service;

import java.util.List;

public interface IGenericService<T> {
	public T save(T model);

	public T find(Long id);

	public List<T> find();

	public int delete(Long id);
}
