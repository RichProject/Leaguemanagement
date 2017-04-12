package Leaguemanagement.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
// @Table(name="abc")
public class Team {
	// @Column(name="abc")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	private String Teamname;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ts")
	private Set<Test> t = new HashSet<Test>();

	public int getID() {
		return ID;
	}

	public Set<Test> getT() {
		return t;
	}

	public void setT(Set<Test> t) {
		this.t = t;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTeamname() {
		return Teamname;
	}

	public void setTeamname(String teamname) {
		Teamname = teamname;
	}

}
