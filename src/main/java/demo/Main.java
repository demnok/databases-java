package demo;

import demo.repository.PostServiceImpl;

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
		
		
		context.getBean(PostServiceImpl.class);
		
	}
}
