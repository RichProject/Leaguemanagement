package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Account;
import Leaguemanagement.Entity.Player;

public interface PlayerDAO extends JpaRepository<Player, Long> {

	
	@Query("SELECT b FROM Player b WHERE LOWER(b.username) = LOWER(:username)")
    public Player findPlayer(@Param("username") String username);
}
