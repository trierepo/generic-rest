package org.tt.genericrest.dao.impl;

import org.springframework.stereotype.Repository;
import org.tt.genericrest.dao.IRoleDao;
import org.tt.genericrest.entity.RoleEntity;

@Repository
public class RoleDaoImpl extends GenericDaoImpl<RoleEntity> implements IRoleDao {
}
