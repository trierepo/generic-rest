package org.tt.genericrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.tt.genericrest.dao.IRoleDao;
import org.tt.genericrest.entity.RoleEntity;
import org.tt.genericrest.service.IRoleService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class RoleServiceImpl extends GenericServiceImpl<RoleEntity> implements IRoleService {

	@Autowired
	public RoleServiceImpl(IRoleDao roleDao) {
		super(roleDao);
	}
}
