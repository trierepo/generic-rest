package org.tt.genericrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role_mst_tbl")
public class RoleEntity extends AbstractEntity {

	private String roleName;

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
		return this.status;
	}

	@Column(name = "ROLE")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
