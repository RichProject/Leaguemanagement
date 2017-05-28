package Leaguemanagement.Controller;

import java.util.ArrayList;
import java.util.List;
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
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Service.accountService;
import Leaguemanagement.Service.gameService;



@RestController
@RequestMapping("/")
public class HomePageController {

	@Autowired
	private accountService accountservice;
	
	@Autowired
	private gameService gameservice;

	static final Logger log = Logger.getLogger(HomePageController.class.getName());
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView initForm(HttpServletRequest request) {
		
			return new ModelAndView("index");
	}


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Account login( @RequestBody accountModal accountmodal,HttpServletRequest request) {
		//accountservice.login(accountmodal);
	//	HttpSession session = request.getSession();
		return accountservice.login(accountmodal);
		
	}
	
	@RequestMapping(value = "/registy", method = RequestMethod.POST)
	public @ResponseBody Account registy( @RequestBody accountModal accountmodal) {
		return accountservice.register(accountmodal) ;
		
	}
	
	@RequestMapping(value = "/game", method = RequestMethod.POST)
	public @ResponseBody List<Game> getalllist() {
		List<Game> list = gameservice.getAll();
		
		return list ;
		
	}
	
	
	

	
	
}
