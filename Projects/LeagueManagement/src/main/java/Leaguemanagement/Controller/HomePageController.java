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
import Leaguemanagement.Entity.Player;
import Leaguemanagement.Entity.Players_Teams;
import Leaguemanagement.Entity.Stadium;
import Leaguemanagement.Entity.Team;
import Leaguemanagement.Modal.ModalGame;
import Leaguemanagement.Modal.StadiumModal;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Service.accountService;
import Leaguemanagement.Service.gameService;
import Leaguemanagement.Service.playerService;
import Leaguemanagement.Service.stadiumService;
import Leaguemanagement.Service.teamService;



@RestController
@RequestMapping("/")
public class HomePageController {

	@Autowired
	private accountService accountservice;
	
	@Autowired
	private gameService gameservice;
	
	@Autowired
	private playerService playerservice;
	
	@Autowired
	private stadiumService stadiumservice;
	
	@Autowired
	private teamService teamservice;

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
	public @ResponseBody List<Game> getalllistgame() {
		List<Game> list = gameservice.getAll();
		
		return list ;
		
	}
	
	@RequestMapping(value = "/player", method = RequestMethod.POST)
	public @ResponseBody List<Player> getalllistplayer() {
		List<Player> list = playerservice.getAll();
		
		return list ;
		
	}
	
	@RequestMapping(value = "/stadium", method = RequestMethod.POST)
	public @ResponseBody List<Stadium> getallstadium() {
		List<Stadium> list = stadiumservice.getAll();
		
		return list ;
		
	}
	
	@RequestMapping(value = "/getPlayerByTeam", method = RequestMethod.POST)
	public @ResponseBody List<Players_Teams> createStadium(@RequestBody String playerID,HttpServletRequest request) {
		return  teamservice.getPlayerByTeamID(playerID);
		
	}
	
	
	
	@RequestMapping(value = "/getteambyAccount", method = RequestMethod.POST)
	public @ResponseBody List<String> createGame_getplayer(@RequestBody String username,HttpServletRequest request) {
		return  gameservice.getListTeam(username);
		
	}
	
	@RequestMapping(value = "/createGame", method = RequestMethod.POST)
	public @ResponseBody Game createGame(@RequestBody ModalGame modal,HttpServletRequest request) {
		System.out.println("create game service");
		System.out.println(modal.getStadiumid());
		System.out.println(modal.getTeamid());
		return  gameservice.addGame(modal);
		
	}
	
	@RequestMapping(value = "/team", method = RequestMethod.POST)
	public @ResponseBody List<Team> loadTeam() {
		
		return teamservice.getAll();
		
	}
	
	@RequestMapping(value = "/createstadium", method = RequestMethod.POST)
	public @ResponseBody Stadium loadTeam(@RequestBody StadiumModal stadiummodal,HttpServletRequest request){
		
		System.out.println(stadiummodal.getStadiumName());
		Stadium stadium = stadiumservice.addStadium(stadiummodal);
		
		return stadium;
		
	}
}
