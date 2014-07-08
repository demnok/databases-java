package demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table (name = "en_users")
public class User {

	@Id
	@Column (name="id", nullable=false)
	private Long id;
	
	@Column (name="user_name", length=100)
	private String userName;
	
	@Column (name="user_mail", length=100)
	private String userMail;

	@Column (name="user_password", length=100)
	private String userPassword;
	
	@Column (name="user_imageUrl", length=100)
	private String userImageUrl;
	
    @ManyToMany 
    @JoinTable (name = "en_user_friends", joinColumns = 
    		@JoinColumn(name=   "id_friend"),  inverseJoinColumns =  @JoinColumn(name = "id_user")) 
    private List<User> friends;
	
	public User(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserImageUrl() {
		return userImageUrl;
	}

	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}

	
	
}
