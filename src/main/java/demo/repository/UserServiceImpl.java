package demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.domain.User;


@Repository
@Transactional(readOnly = true)
public class UserServiceImpl extends UserServiceI{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public User save(User user){
		
		if(user.getId() == null){
			em.persist(user);
			return user;
		} else{
			return em.merge(user);
		}
	}
	
	@Override
	@Transactional
	public void remove(User user){
		
		if(user.getId() != null)
		{
			em.merge(user);
			em.remove(user);
		}
	}
	
	@Override
	public List<User> findByUser(User user){
		
		TypedQuery<User> query = em.createQuery("select a from User a where a.user = ?1", User.class);
		query.setParameter(1,user);
		
		return query.getResultList();
	}
}

