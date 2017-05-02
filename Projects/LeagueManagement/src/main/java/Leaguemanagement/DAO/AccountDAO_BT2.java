package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Leaguemanagement.Entity.Account_BT2;

public interface AccountDAO_BT2 extends JpaRepository<Account_BT2, Long>  {


	
	@Query("SELECT a FROM Account_BT2 a WHERE LOWER(a.username) = LOWER(:username)")
    public Account_BT2 login(@Param("username") String username);
	
}