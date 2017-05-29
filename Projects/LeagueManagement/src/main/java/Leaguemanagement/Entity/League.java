package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class League {
	@Id
	private String leagueID;
	
	private String leagueName;
	
	private String gameType;
}
