package org.greysalmon.service.impl;

import org.greysalmon.dao.UserDao;
import org.greysalmon.model.User;
import org.greysalmon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		userDao.create(user);
	}

	@Override
	public User find(Long userId) {
		// TODO Auto-generated method stub
		return userDao.find(userId);
	}

}
