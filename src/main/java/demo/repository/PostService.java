package demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domain.Post;
import demo.domain.User;

@Service
public class PostService {

	@Autowired
	private PostServiceImpl psi;
	
	public void voteForPost(Post post){
		
	}
	
	public void addPost(Post post){
		psi.save(post);
	}
	
	public void removePost(Post post){
		psi.remove(post);
	}
	
	public List<Post> getMyFriendsPostsByDate(User user){
				
		List<User> friends = user.getFriends();
		
		return new ArrayList<Post>();
	}
	
}
