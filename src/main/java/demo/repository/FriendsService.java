package demo.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domain.User;

@Service
public class FriendsService {

	@Autowired
	private UserServiceImpl usi;
	
	public List<User> findMyFriends(User user){
		
		List<User> myFriends = user.getFriends();
		
		return myFriends;
	}
	
	public  void addUser(User user){
		
	}
	
	public void removeUser(User user){
		
	}

	public List<User> sortMyFriends(User user) {
		List<User> myFriends = user.getFriends();
		
		Collections.sort(myFriends, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getUserName().compareToIgnoreCase(o2.getUserName());
			}
		});
		
		return myFriends;
		
	}
	
}
