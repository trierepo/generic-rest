package org.tt.genericrest.dao.impl;

import org.springframework.stereotype.Repository;
import org.tt.genericrest.dao.IUserDao;
import org.tt.genericrest.entity.UserEntity;

@Repository
public class UserDaoImpl extends GenericDaoImpl<UserEntity> implements IUserDao {
}
