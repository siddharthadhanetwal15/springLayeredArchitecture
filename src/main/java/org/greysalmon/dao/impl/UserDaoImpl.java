package org.greysalmon.dao.impl;

import org.greysalmon.dao.UserDao;
import org.greysalmon.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		currentSession().save(user);
	}

	@Override
	public User find(Long userId) {
		// TODO Auto-generated method stub
		return (User)currentSession().get(User.class, userId);
	}

}
