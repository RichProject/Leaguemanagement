package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Leaguemanagement.Entity.Stadium;

public interface StadiumDAO  extends JpaRepository<Stadium, Long> {

}
