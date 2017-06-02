package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.DAO.Players_TeamsDAO;
import Leaguemanagement.DAO.StadiumDAO;
import Leaguemanagement.DAO.TeamDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Player;
import Leaguemanagement.Entity.Stadium;
import Leaguemanagement.Entity.Team;
import Leaguemanagement.Modal.ModalGame;
import Leaguemanagement.Utilities.GameUltility;


@Service("gameService")
public class gameService {

	
	@Autowired
	private GameDAO gameDao;
	
	@Autowired
	private StadiumDAO stadiumDao;
	
	@Autowired
	private TeamDAO teamDao;
	
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
	
	public static Game setExpire(Game game){
		Date date = new Date();
		if(game.getDate().before(date)){
			game.setStatus("close");
		}
		else{
			game.setStatus("open");
		}
		return game;
	}
	
	public List<String> getListTeam(String username){
		List<String> listeam = new ArrayList<String>();
		
		return players_teamDao.listTeam(username);
		
	}
	
	public Game addGame(ModalGame modalgame){
		Game game = new Game();
		Stadium stadium =  stadiumDao.findStadiumbyID(modalgame.getStadiumid());
			if(stadium == null) {
				stadium = stadiumDao.findStadiumbyID("STD0");
				stadium.setAddress(modalgame.getStadiumid());
			}
		Team teamcreate = teamDao.findTeambyID(modalgame.getTeamid());
		int countGame = (int) gameDao.count();
		String setGameID = "G" + countGame;
		game.setGameID(setGameID);
		game.setStatus("open");
		game.setStadium(stadium);
		game.setTeamCreate(teamcreate);
		game.setWinRate(teamcreate.getWinRate());
		game.setPoint(teamcreate.getPoint());
		game.setDate((java.sql.Date) modalgame.getGameDate());
		game.setTime(modalgame.getGametime());
		try {
			gameDao.save(setExpire(game));
			return setExpire(game);
		}
		catch(Exception e){
			return null;
		}
	}
	
	
}
