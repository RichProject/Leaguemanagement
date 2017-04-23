package Leaguemanagement.Modal;

public class accountModal {
	private long Id;
	private String fullname;
	private String phoneNumber;
	private String username;
	private String password;
	
	public accountModal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public accountModal(long id, String fullname, String phoneNumber,
			String username, String password) {
		super();
		Id = id;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
