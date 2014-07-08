package demo.repository;

import java.util.List;

import demo.domain.Post;

public abstract class PostServiceI {

	public abstract Post save(Post post);

	public abstract void remove(Post post);
	
	public abstract List<Post> findByPost(Post post);

}
