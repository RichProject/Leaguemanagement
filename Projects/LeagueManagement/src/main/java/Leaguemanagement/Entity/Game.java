package Leaguemanagement.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String teamId;
	private String teamLeader;
	private String teamName;
	private String phoneNumber;
	private String stadium;
	private String address;
	private String time;
	private Date date;
	private String status;
	private String note;
	private String point;
	private float winRate;
	
	
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTeamId() {
		return teamId;
	}
	
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public Game(long id, String teamId, String teamLeader, String teamName, String phoneNumber, String stadium,
			String address, String time, Date date, String status, String point, String note, float winRate) {
		super();
		Id = id;
		this.teamId = teamId;
		this.teamLeader = teamLeader;
		this.teamName = teamName;
		this.phoneNumber = phoneNumber;
		this.stadium = stadium;
		this.address = address;
		this.time = time;
		this.date = date;
		this.status = status;
		this.point = point;
		this.note = note;
		this.winRate = winRate;
	}
	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
