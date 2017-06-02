package Leaguemanagement.Utilities;

import org.springframework.beans.factory.annotation.Autowired;

import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.DAO.StadiumDAO;
import Leaguemanagement.DAO.TeamDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Stadium;
import Leaguemanagement.Entity.Team;
import Leaguemanagement.Modal.ModalGame;

public class GameUltility {

	@Autowired
	static GameDAO gameDao;
	
	@Autowired
	static StadiumDAO stadiumDao;
	
	@Autowired
	static TeamDAO teamDao;
	
	public static Game prepareSaveGame(ModalGame modalgame){
		
		Game game = new Game();
		
		System.out.println(modalgame.getStadiumid());
		
		Stadium stadium =  stadiumDao.findStadiumbyID(modalgame.getStadiumid());
		System.out.println(modalgame.getTeamid());
		
		Team teamcreate = teamDao.findTeambyID(modalgame.getTeamid());
		
		int countGame = (int) gameDao.count();
		String setGameID = "G" + countGame;
		game.setGameID(setGameID);
		game.setStatus("open");
		game.setStadium(stadium);
		game.setTeamCreate(teamcreate);
		game.setWinRate(teamcreate.getWinRate());
		game.setPoint(teamcreate.getPoint());
		return game;
	}
}
