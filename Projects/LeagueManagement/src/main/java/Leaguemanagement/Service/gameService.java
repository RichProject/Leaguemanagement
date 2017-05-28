package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.AccountDAO;
import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.Entity.Account;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Utilities.AccountUltility;


@Service("gameService")
public class gameService {

	
	@Autowired
	private GameDAO gameDao;
	

	public List<Game> getAll(){
		List<Game> listGame = new ArrayList<Game>();
		listGame= gameDao.findAll();
		return listGame;
	}
}
