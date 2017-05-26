package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.Entity.Game;

@Service("gameService")
public class gameService {

	
	@Autowired
	private GameDAO gamedao;

	
	public List<Game> getallGames(){
		
		
		
		return gamedao.findAll();
		
	}
	
}
