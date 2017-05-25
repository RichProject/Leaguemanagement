package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String leagueName;
	private String gameType;
}
