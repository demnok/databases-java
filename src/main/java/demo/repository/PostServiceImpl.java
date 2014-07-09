package demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.domain.Post;


@Service
@Transactional (readOnly = true)
public class PostServiceImpl extends PostServiceI {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Post save(Post post){
		
		if(post.getId() == null)
		{
			em.persist(post);
			return post;
		} else{
			return em.merge(post);
		}
	}
	
	@Override
	@Transactional
	public void remove(Post post){
		
		if(post.getId() != null){
			em.merge(post);
			em.remove(post);
		}
	}
	
	@Override
	@Transactional
	public  List<Post> findByPost(Post post){
		
		TypedQuery<Post> query = em.createQuery("select a from Post a where a.id = ?1", Post.class);
		query.setParameter(1,post.getId());
		
		return query.getResultList();
	}
}
