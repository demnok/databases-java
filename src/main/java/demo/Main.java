package demo;

import demo.domain.Account;
import demo.repository.AccountRepository;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/datasource/postgres.xml",
				"config/application-context.xml"
		);

		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		List<Account> accounts = accountRepository.getAccounts();
		System.out.println("accounts = " + accounts.size());
	}
}
