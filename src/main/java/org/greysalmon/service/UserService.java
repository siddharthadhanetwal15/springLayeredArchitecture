package org.greysalmon.service;

import org.greysalmon.model.User;

public interface UserService {
	public void create(User user);
	public User find(Long userId);
}
