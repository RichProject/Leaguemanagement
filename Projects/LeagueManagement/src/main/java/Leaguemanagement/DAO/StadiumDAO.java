package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Account;
import Leaguemanagement.Entity.Stadium;

public interface StadiumDAO  extends JpaRepository<Stadium, Long> {

	
	@Query("SELECT s FROM Stadium s WHERE LOWER(s.stadiumID) = LOWER(:stadiumID)")
    public Stadium findStadiumbyID(@Param("stadiumID") String stadiumId);
}
