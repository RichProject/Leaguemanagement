package Leaguemanagement.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Player;
import Leaguemanagement.Entity.Players_Teams;

public interface Players_TeamsDAO  extends JpaRepository<Players_Teams, Long>{

	@Query("SELECT b FROM Player b WHERE LOWER(b.username) = LOWER(:username)")
    public List<String> listTeam(@Param("username") String username);
	
}
