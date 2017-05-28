package Leaguemanagement.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Game;



public interface GameDAO extends JpaRepository<Game, Long>  {

//	@Query("SELECT acc FROM Account acc ")
//	Account login();
	
//	@Query("SELECT * FROM Game")
//    public List<Game> getAllGame();
}
