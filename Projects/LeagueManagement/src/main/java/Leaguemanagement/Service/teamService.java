package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.Players_TeamsDAO;
import Leaguemanagement.DAO.StadiumDAO;
import Leaguemanagement.DAO.TeamDAO;
import Leaguemanagement.Entity.Players_Teams;
import Leaguemanagement.Entity.Team;

@Service("teamService")
public class teamService {

	
	@Autowired
	private TeamDAO teamDao;
	
	@Autowired
	private Players_TeamsDAO players_teamDao;
	
	public List<Team> getAll(){
		List<Team> listteam = new ArrayList<Team>();
		listteam= teamDao.findAll();
//		listStadium.remove(0);
		return listteam;
	}
	
	public List<Players_Teams> getPlayerByTeamID(String teamid){
		List<Players_Teams> listPlayerteam = players_teamDao.listPlayer(teamid);
		return listPlayerteam;
	}
	
}
