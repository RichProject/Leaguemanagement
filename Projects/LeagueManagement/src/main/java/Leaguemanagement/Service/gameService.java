package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.DAO.Players_TeamsDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Player;


@Service("gameService")
public class gameService {

	
	@Autowired
	private GameDAO gameDao;
	
	@Autowired
	private Players_TeamsDAO players_teamDao;
	

	public List<Game> getAll(){
		List<Game> listGame = new ArrayList<Game>();
		listGame= gameDao.findAll();
		return gameService.setExpire(listGame);
	}
	
	public static List<Game> setExpire(List<Game> listgame){
		Date date = new Date();
		for(int i = 0; i < listgame.size() ; i++){
			if(listgame.get(i).getDate().before(date)){
				listgame.get(i).setStatus("close");
			}
			else{
				listgame.get(i).setStatus("open");
			}
		}
		
		return listgame;
	}
	
	public List<String> getListTeam(String username){
		return players_teamDao.listTeam(username);
		
	}
}
