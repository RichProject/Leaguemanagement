package Leaguemanagement.Modal;

public class accountModal {
	private long Id;
	
	private String username;
	private String password;
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
	public accountModal(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public long getId() {
		return Id;
	}
	public accountModal(long id, String username, String password) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
	}
	public accountModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(long id) {
		Id = id;
	}
	
}
