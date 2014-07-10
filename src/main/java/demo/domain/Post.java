package demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = Post.FIND_ALL, query = "select a from Post a order by a.name"),
    @NamedQuery(name = Post.FIND_POSTS_BY_USER, query = "select a from Post a where user:= user")
})
@Entity
@Table (name="en_posts")
public class Post {
	
	public static final String FIND_ALL = "Post.findAll";
	public static final String FIND_POSTS_BY_USER = "Post.findByUser";
	
	@Id
	@Column (name="id", nullable=false)
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
