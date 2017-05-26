package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String teamName;
	private String leaderName;
	private int numberOfMatch;
	private int win;
	private float winRate;
	private String point;
	private int numberOfMem;
	private String address;
	
}
