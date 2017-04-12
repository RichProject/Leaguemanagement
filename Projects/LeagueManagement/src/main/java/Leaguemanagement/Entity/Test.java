package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idabc;
	@ManyToOne
	@JoinColumn(name="ID")
	private Team ts;
	public int getIdabc() {
		return idabc;
	}

	public void setIdabc(int idabc) {
		this.idabc = idabc;
	}

}
