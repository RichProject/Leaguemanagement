package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Stadium;
import Leaguemanagement.Entity.Team;

public interface TeamDAO extends JpaRepository<Team, Long>{
	
	
	@Query("SELECT team FROM Team team WHERE LOWER(team.teamID) = LOWER(:teamId)")
    public Team findTeambyID(@Param("teamId") String teamId);
}
