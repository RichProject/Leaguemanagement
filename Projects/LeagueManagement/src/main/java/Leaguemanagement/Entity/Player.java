package Leaguemanagement.Entity;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Player {

	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Id  
	private String username;	
	
	@OneToOne @MapsId
	private Account account;
	
	private String teamId;
	
	private String position;
	
	private int gameplayed;
	
	private float winRate;
	
	private int totalGoal;
	
	private int totalYellowCard;
	
	private int totalRedCard;
	
	private int totalMinutePlayed;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Player(long id, String username, Account account, String teamId, String position, int gameplayed,
			float winRate, int totalGoal, int totalYellowCard, int totalRedCard, int totalMinutePlayed) {
		super();
		Id = id;
		this.username = username;
		this.account = account;
		this.teamId = teamId;
		this.position = position;
		this.gameplayed = gameplayed;
		this.winRate = winRate;
		this.totalGoal = totalGoal;
		this.totalYellowCard = totalYellowCard;
		this.totalRedCard = totalRedCard;
		this.totalMinutePlayed = totalMinutePlayed;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getGameplayed() {
		return gameplayed;
	}

	public void setGameplayed(int gameplayed) {
		this.gameplayed = gameplayed;
	}

	public float getWinRate() {
		return winRate;
	}

	public void setWinRate(float winRate) {
		this.winRate = winRate;
	}

	public int getTotalGoal() {
		return totalGoal;
	}

	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}

	public int getTotalYellowCard() {
		return totalYellowCard;
	}

	public void setTotalYellowCard(int totalYellowCard) {
		this.totalYellowCard = totalYellowCard;
	}

	public int getTotalRedCard() {
		return totalRedCard;
	}

	public void setTotalRedCard(int totalRedCard) {
		this.totalRedCard = totalRedCard;
	}

	public int getTotalMinutePlayed() {
		return totalMinutePlayed;
	}

	public void setTotalMinutePlayed(int totalMinutePlayed) {
		this.totalMinutePlayed = totalMinutePlayed;
	}
	
	
}
