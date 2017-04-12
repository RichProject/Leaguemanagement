package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Account;



public interface AccountDAO extends JpaRepository<Account, Long>  {

	@Query("SELECT acc FROM Account acc WHERE acc.username = :username ")
	Account login(@Param("username") String userName);
}
