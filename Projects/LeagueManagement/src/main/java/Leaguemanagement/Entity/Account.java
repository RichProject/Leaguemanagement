package Leaguemanagement.Entity;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
@Embeddable
public class Account {
	
	@Id 
	private String username;
	
	private	String password;
	
	private	String fullname;
	
	private String phoneNumber;
	
	private Date birthday;
	
	private String address;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isOwner;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isPlayer;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isManager;
	
	private int countLogin;
	
	private int pointAward; 
	
	private String description;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isOwner() {
		return isOwner;
	}


	public void setOwner(boolean isOwner) {
		this.isOwner = isOwner;
	}


	public boolean isPlayer() {
		return isPlayer;
	}


	public void setPlayer(boolean isPlayer) {
		this.isPlayer = isPlayer;
	}


	public boolean isManager() {
		return isManager;
	}


	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}


	public int getCountLogin() {
		return countLogin;
	}


	public void setCountLogin(int countLogin) {
		this.countLogin = countLogin;
	}


	public int getPointAward() {
		return pointAward;
	}


	public void setPointAward(int pointAward) {
		this.pointAward = pointAward;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Account(String username, String password, String fullname, String phoneNumber, Date birthday, String address,
			boolean isOwner, boolean isPlayer, boolean isManager, int countLogin, int pointAward, String description) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.address = address;
		this.isOwner = isOwner;
		this.isPlayer = isPlayer;
		this.isManager = isManager;
		this.countLogin = countLogin;
		this.pointAward = pointAward;
		this.description = description;
	}



	



	

	
	
}
