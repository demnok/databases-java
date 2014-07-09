package demo;

import java.util.List;

import demo.domain.Post;
import demo.repository.PostServiceImpl;

import org.hsqldb.rights.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/datasource/postgres.xml",
				"config/application-context.xml"
		);

//		AccountRepository accountRepository = context.getBean(AccountRepository.class);
//		List<Account> accounts = accountRepository.getAccounts();
//		System.out.println("accounts = " + accounts.size());
		
//		User georgica = new User();
//		georgica.setUserName("string");
//		
		PostServiceImpl serv = context.getBean(PostServiceImpl.class);
		Post post = new Post();
		post.setPostTitle("Whatev");
		post.setPostDate("12321312");
		post.setPostBody("Whatevs");
		List<Post> posts = serv.findByPost(post);
		System.out.println("size post " + posts.size());
	}
}
