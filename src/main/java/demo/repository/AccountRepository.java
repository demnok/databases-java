package demo.repository;

import demo.domain.Account;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Account> getAccounts() {
    	Account acc = new Account();
    	acc.setName("test");
    	acc.setEmail("test@email.com");
    	em.persist(acc);
        TypedQuery<Account> query = em.createNamedQuery(Account.FIND_ALL, Account.class);
        return query.getResultList();
    }
}
