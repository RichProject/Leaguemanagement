package Leaguemanagement.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Embeddable
public class Team {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Id
	private String teamID;
	
	private String teamName;
	
	private String leaderName;
	
	private int numberOfMatch;
	
	private int win;
	
	private float winRate;
	
	private String point;
	
	private int numberOfMem;
	
	private String address;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Team(long id, String teamID, String teamName, String leaderName, int numberOfMatch, int win, float winRate,
			String point, int numberOfMem, String address) {
		super();
		Id = id;
		this.teamID = teamID;
		this.teamName = teamName;
		this.leaderName = leaderName;
		this.numberOfMatch = numberOfMatch;
		this.win = win;
		this.winRate = winRate;
		this.point = point;
		this.numberOfMem = numberOfMem;
		this.address = address;
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
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
