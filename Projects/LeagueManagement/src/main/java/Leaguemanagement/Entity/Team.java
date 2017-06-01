package Leaguemanagement.Entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Embeddable
public class Team {
	@Id
	private String teamID;
	
	private String teamName;
	
	@OneToOne (fetch=FetchType.LAZY)
	private Player leader;
	
	private int numberOfMatch;
	
	private int win;
	
	private float winRate;
	
	private String point;
	
	private int numberOfMem;
	
	private String address;
	
	@ManyToMany(mappedBy = "listTeams",fetch=FetchType.LAZY)
	@JsonIgnore
	private Set<Player> listPlayers = new HashSet<Player>();
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Set<Player> getListPlayers() {
		return listPlayers;
	}


	public void setListPlayers(Set<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}


	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public Player getLeader() {
		return leader;
	}

	public void setLeader(Player leader) {
		this.leader = leader;
	}

	public int getNumberOfMatch() {
		return numberOfMatch;
	}

	public void setNumberOfMatch(int numberOfMatch) {
		this.numberOfMatch = numberOfMatch;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public float getWinRate() {
		return winRate;
	}

	public void setWinRate(float winRate) {
		this.winRate = winRate;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public int getNumberOfMem() {
		return numberOfMem;
	}

	public void setNumberOfMem(int numberOfMem) {
		this.numberOfMem = numberOfMem;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
