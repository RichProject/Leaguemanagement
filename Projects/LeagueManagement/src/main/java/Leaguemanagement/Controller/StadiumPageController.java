package Leaguemanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Leaguemanagement.Service.accountService;
import Leaguemanagement.Service.gameService;
import Leaguemanagement.Service.playerService;
import Leaguemanagement.Service.stadiumService;
import Leaguemanagement.Service.teamService;

@RestController
@RequestMapping("/game")
public class StadiumPageController {
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
}
