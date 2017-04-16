package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Account;



public interface AccountDAO extends JpaRepository<Account, Long>  {

//	@Query("SELECT acc FROM Account acc ")
//	Account login();
	
	@Query("SELECT a FROM Account a WHERE LOWER(a.username) = LOWER(:username)")
    public Account login(@Param("username") String username);
}
