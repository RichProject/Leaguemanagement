package Leaguemanagement.Modal;

import java.sql.Date;

public class ModalGame {

	private String teamid;
	
	private String stadiumid;

	private Date gameDate;
	
	private String gametime;
	
	
	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public String getGametime() {
		return gametime;
	}

	public void setGametime(String gametime) {
		this.gametime = gametime;
	}

	public String getTeamid() {
		return teamid;
	}

	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}

	public String getStadiumid() {
		return stadiumid;
	}

	public void setStadiumid(String stadiumid) {
		this.stadiumid = stadiumid;
	}

	public ModalGame(String teamid, String stadiumid) {
		super();
		this.teamid = teamid;
		this.stadiumid = stadiumid;
	}

	public ModalGame() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
