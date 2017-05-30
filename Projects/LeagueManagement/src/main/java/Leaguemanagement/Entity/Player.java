package Leaguemanagement.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Embeddable
public class Player {
	
	@Id  
	private String username;	
	
	@OneToOne @MapsId 
	private Account account;
	
	private String position;
	
	private int gamePlayed;
	
	private float winRate;
	
	private int totalGoal;
	
	private int totalYellowCard;
	
	private int totalRedCard;
	
	private int totalMinutePlayed;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name = "Players_Teams", joinColumns = @JoinColumn(name = "player_id", referencedColumnName = "account_username"), inverseJoinColumns = @JoinColumn(name = "team_id", referencedColumnName = "teamID"))
	@JsonIgnore
	private Set<Team> listTeams = new HashSet<Team>();

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Set<Team> getListTeams() {
		return listTeams;
	}
	
	public void setListTeams(Set<Team> listTeams) {
		this.listTeams = listTeams;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getGamePlayed() {
		return gamePlayed;
	}

	public void setGamePlayed(int gameplayed) {
		this.gamePlayed = gameplayed;
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
