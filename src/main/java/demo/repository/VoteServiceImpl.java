package demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.domain.Vote;


@Repository
@Transactional (readOnly = true)
public class VoteServiceImpl extends VoteServiceI{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Vote save(Vote vote){
		
		if(vote.getId() == null)
		{
			em.persist(vote);
			return vote;
		} else{
			return em.merge(vote);
		}
	}
	
	@Override
	@Transactional
	public void remove(Vote vote){
		
		if(vote.getId() == null){
			em.merge(vote);
			em.remove(vote);
		}
	}
	
	@Override
	public List<Vote> findByVote(Vote vote){
		
		TypedQuery<Vote> query = em.createQuery("select a from Vote a where a.vote = ?1", Vote.class);
		query.setParameter(1, vote);
		
		return query.getResultList();
	}
}
