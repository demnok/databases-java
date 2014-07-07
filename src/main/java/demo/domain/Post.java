package demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="en_posts")
public class Post {
	
	@Id
	@Column (name="id", nullable=false)
	private int id;
	
	@Column (name="post_title", length=100)
	private String postTitle;

	@Column (name="post_body", length=450)
	private String postBody;
	
	@Column (name="post_date")
	private String postDate;
	
	@ManyToOne
	@JoinColumn(name = "id_owner")
	private User user;
	
	public Post(){
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostBody() {
		return postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
