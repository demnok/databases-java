package demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "en_votes")
public class Vote {

	@Id
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "pozitive_vote")
	private boolean pozitiveVote;

	@ManyToOne
	@JoinColumn(name = "id_post")
	private Post post;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;

	public Vote() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPozitiveVote() {
		return pozitiveVote;
	}

	public void setPozitiveVote(boolean pozitiveVote) {
		this.pozitiveVote = pozitiveVote;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
