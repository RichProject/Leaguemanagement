package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.GameDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Player;


@Service("gameService")
public class gameService {

	
	@Autowired
	private GameDAO gameDao;
	

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
	
	public static void test(List<Game> listGame){
		System.out.println("test entity");
		for(Player b: listGame.get(0).getTeamCreate().getListPlayers()){
			System.out.println(b.getUsername());
		}
		
	}
}
