package demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.domain.Account;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createSpitterProfile(Model model) {
		model.addAttribute(new Account());
		return "account/edit";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addAccountFromForm(@Valid Account account, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "account/edit";
		}
		return "redirect:/account/" + account.getName();
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String showAccount(@PathVariable String username, Model model) {
	
		model.addAttribute("username", username);
	
		return "account/view";
	}
	
}
