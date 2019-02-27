package org.tt.genericrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_mst_tbl")
public class UserEntity extends AbstractEntity {

	private String username;
	private String password;

	@Id
	@Override
	@GeneratedValue
	@Column(name = "ID")
	public Long getId() {
		return this.id;
	}

	@Override
	@Column(name = "STATUS")
	public String getStatus() {
		// TODO Auto-generated method stub
		return this.status;
	}

	@Column(name = "USER_NAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
