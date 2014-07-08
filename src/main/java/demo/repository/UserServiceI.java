package demo.repository;

import java.util.List;

import demo.domain.User;

public abstract class UserServiceI {

	public abstract User save(User user);
	
	public abstract void remove(User user);
	
	public abstract List<User> findByUser(User user);

}
