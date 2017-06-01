package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.DAO.PlayerDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Player;

@Service("playerService")
public class playerService {

	
	@Autowired
	private PlayerDAO playerDao;
	
	public List<Player> getAll(){
		List<Player> listPlayer = new ArrayList<Player>();
		listPlayer= playerDao.findAll();
		return listPlayer;
	}
	
	public Player getOnePlayerByAcc(String username){
		Player player = playerDao.findPlayer(username);
		return player;
	}
}
