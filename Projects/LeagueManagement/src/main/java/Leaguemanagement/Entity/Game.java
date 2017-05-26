package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String teamLeader;
	private String phoneNumber;
	private String stadium;
	private String address;
	private String time;
	private String status;
	private String point;
	private String note;
	private float winRate;
	
	
	
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Game(long id, String teamLeader, String phoneNumber, String stadium, String address, String time,
			String status, String point, String note, float winRate) {
		super();
		Id = id;
		this.teamLeader = teamLeader;
		this.phoneNumber = phoneNumber;
		this.stadium = stadium;
		this.address = address;
		this.time = time;
		this.status = status;
		this.point = point;
		this.note = note;
		this.winRate = winRate;
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
