package Leaguemanagement.DAO;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Game;

public interface GameDAO extends JpaRepository<Game, Long>{
	
	
	
	
	//Get game open
	@Query("SELECT a FROM Game a WHERE a.status='open' ")
    public ArrayList<Game> getOpen();
	
	//Get game close
	@Query("SELECT a FROM Game a WHERE a.status='close' ")
    public ArrayList<Game> getClose(@Param("username") String username);
}
