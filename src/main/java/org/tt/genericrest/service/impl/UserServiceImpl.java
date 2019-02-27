package org.tt.genericrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.tt.genericrest.dao.IUserDao;
import org.tt.genericrest.entity.UserEntity;
import org.tt.genericrest.service.IUserService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl extends GenericServiceImpl<UserEntity> implements IUserService {

	@Autowired
	public UserServiceImpl(IUserDao userDao) {
		super(userDao);
	}
}
