package Leaguemanagement.Modal;

public class accountModal_BT2 {
	
	private String username;
	
	private	String password;
	
	private int logintime;




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

	public accountModal_BT2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public accountModal_BT2(String username, String password, int logintime) {
		super();
		this.username = username;
		this.password = password;
		this.logintime = logintime;
	}


	
}
