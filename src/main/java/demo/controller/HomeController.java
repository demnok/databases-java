package demo.controller;

import java.util.List;
import java.util.Map;

import demo.domain.Account;
import demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = {"/home", ""})
    public String viewStats(Map<String, Object> model) {
        List<Account> accounts = accountRepository.getAccounts();
        model.put("accountCount", accounts.size());

        return "home";
    }
}
