package org.greysalmon.dao;

import org.greysalmon.model.User;

public interface UserDao {
	public void create(User user);
	public User find(Long userId);
}
