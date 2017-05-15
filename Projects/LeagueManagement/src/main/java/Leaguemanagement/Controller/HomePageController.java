package Leaguemanagement.Controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody accountModal login( @RequestBody accountModal accountmodal,HttpServletRequest request) {
		accountModal account = accountservice.login(accountmodal);
		
		HttpSession session = request.getSession();
		return account ;
		
	}
	
	@RequestMapping(value = "/registy", method = RequestMethod.POST)
	public @ResponseBody Account registy( @RequestBody accountModal accountmodal) {

		return accountservice.register(accountmodal) ;
		
	}
	

	
	
}
