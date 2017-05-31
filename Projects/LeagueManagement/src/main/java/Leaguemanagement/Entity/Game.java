package Leaguemanagement.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Proxy(lazy = false) 
public class Game {

	@Id
	private String gameID;
	
	@OneToOne (fetch=FetchType.EAGER)
	private Team teamCreate;
	
	@OneToOne
	private Stadium stadium;
	
	private String time;
	
	private Date date;
	
	private String status;
	
	private String note;
	
	private String point;
	
	private float winRate;
	
	public Game(String gameID, Team teamCreate, Stadium stadium, String time, Date date, String status, String note,
			String point, float winRate) {
		super();
		this.gameID = gameID;
		this.teamCreate = teamCreate;
		this.stadium = stadium;
		this.time = time;
		this.date = date;
		this.status = status;
		this.note = note;
		this.point = point;
		this.winRate = winRate;
	}



	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getGameID() {
		return gameID;
	}


	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public Team getTeamCreate() {
		return teamCreate;
	}


	public void setTeamCreate(Team teamCreate) {
		this.teamCreate = teamCreate;
	}


	public Stadium getStadium() {
		return stadium;
	}


	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public float getWinRate() {
		return winRate;
	}
	public void setWinRate(float winRate) {
		this.winRate = winRate;
	}
}
