package Leaguemanagement.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Leaguemanagement.Entity.Account;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Service.gameService;

@RestController
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private gameService gameService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Game> initForm(HttpServletRequest request) {
		List<Game> listGames = new List<Game>();
		listGames=gameService.getallGames();
		
		for (int i =0;i<=listGames.size();i++){
			System.out.println(listGames.get(i));
		}
		return listGames;
	}
}
