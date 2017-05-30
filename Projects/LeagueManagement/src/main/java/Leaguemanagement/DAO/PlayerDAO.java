package Leaguemanagement.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Leaguemanagement.Entity.Player;

public interface PlayerDAO extends JpaRepository<Player, Long> {

}
