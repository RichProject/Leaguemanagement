package Leaguemanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Players_Teams")
public class Players_Teams {
	
	@Id
	private String ID;
	
	@Column(name = "player_id")
	private String player_id;
	
	@Column(name = "player_fullname")
	private String player_fullname;
	
	@Column(name = "team_id")
	private String team_id;
	
	@Column(name = "team_name")
	private String team_name;
	
	public Players_Teams() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getPlayer_fullname() {
		return player_fullname;
	}


	public void setPlayer_fullname(String player_fullname) {
		this.player_fullname = player_fullname;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getTeam_name() {
		return team_name;
	}


	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


	public String getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(String player_id) {
		this.player_id = player_id;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}


}
