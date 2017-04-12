package Leaguemanagement.Controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




import Leaguemanagement.Entity.Account;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Service.accountService;



@RestController
@RequestMapping("/")
public class HomePageController {

	@Autowired
	private accountService accountservice;

	static final Logger log = Logger.getLogger(HomePageController.class.getName());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView initForm(HttpServletRequest request) {
		
			return new ModelAndView("index");
		}

	@RequestMapping(value = "/getusername", method = RequestMethod.POST)
	public @ResponseBody void update () {
		
		accountservice.testaccount();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Account login( @RequestBody accountModal accountmodal) {
		System.out.println("controller " + accountmodal.getPassword());
		System.out.println("controller " + accountmodal.getUsername());
		System.out.println("controller "+ accountmodal.getId());
		return accountservice.login(accountmodal) ;
		
	}
}
