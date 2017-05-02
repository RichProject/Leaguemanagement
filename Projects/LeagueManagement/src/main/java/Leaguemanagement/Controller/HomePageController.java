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
import Leaguemanagement.Entity.Account_BT2;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Modal.accountModal_BT2;
import Leaguemanagement.Service.accountService;
import Leaguemanagement.Service.accountService_BT2;



@RestController
@RequestMapping("/")
public class HomePageController {

	@Autowired
	private accountService accountservice;
	
	
	@Autowired
	private accountService_BT2 accountservicebt2;

	static final Logger log = Logger.getLogger(HomePageController.class.getName());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView initForm(HttpServletRequest request) {
		
			return new ModelAndView("index");
	}


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Account login( @RequestBody accountModal accountmodal) {

		return accountservice.login(accountmodal) ;
		
	}
	
	@RequestMapping(value = "/registy", method = RequestMethod.POST)
	public @ResponseBody Account registy( @RequestBody accountModal accountmodal) {

		return accountservice.register(accountmodal) ;
		
	}
	

	@RequestMapping(value = "/login_bt2", method = RequestMethod.POST)
	public @ResponseBody accountModal_BT2 login( @RequestBody accountModal_BT2 accountModal_Bt2) {
		System.out.println("bt2 ontroller");
		
		return accountservicebt2.login(accountModal_Bt2);
		
	}
	
	
	
}
