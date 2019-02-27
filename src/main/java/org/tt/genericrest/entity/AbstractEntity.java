package org.tt.genericrest.entity;

public abstract class AbstractEntity {
	protected Long id;
	protected String status;

	public abstract Long getId();

	public void setId(Long id) {
		this.id = id;
	}

	public abstract String getStatus();

	public void setStatus(String status) {
		this.status = status;
	}
}
