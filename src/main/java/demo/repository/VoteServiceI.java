package demo.repository;

import java.util.List;

import demo.domain.Vote;

public abstract class VoteServiceI {

	public abstract Vote save(Vote vote);

	public abstract void remove(Vote vote);
	
	public abstract List<Vote> findByVote(Vote vote);

}
