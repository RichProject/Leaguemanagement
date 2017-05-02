package Leaguemanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account_BT2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	private String username;
	
	private	String password;
	
	private int logintime;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLogintime() {
		return logintime;
	}

	public void setLogintime(int logintime) {
		this.logintime = logintime;
	}

	public Account_BT2(long id, String username, String password, int logintime) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.logintime = logintime;
	}
	public Account_BT2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
