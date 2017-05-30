package Leaguemanagement.Entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
@Embeddable
public class Stadium {
	
	@Id
	private String stadiumID;
	
	private String stadiumName;
	
	@OneToOne
	private Account ownerName;
	
	private String address;
	
	private String district;
	
	private String ward;
	
	private String note;
	
	private String status;
	
	private int totalground;
	
	private int sevenGround;
	
	private double priceSevenGround;
	
	private int fiveGround;
	
	private double priceFiveGround;
	
	private int elevenGround;
	
	private double priceElevenGround;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean haveClothShop;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean haveCanteen;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isFull;

	public Stadium() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Stadium(String stadiumID, String stadiumName, Account ownerName, String address, String district,
			String ward, String note, int totalground, int sevenGround, double priceSevenGround, int fiveGround,
			double priceFiveGround, int elevenGround, double priceElevenGround, boolean haveClothShop,
			boolean haveCanteen, boolean isFull) {
		super();
		this.stadiumID = stadiumID;
		this.stadiumName = stadiumName;
		this.ownerName = ownerName;
		this.address = address;
		this.district = district;
		this.ward = ward;
		this.note = note;
		this.totalground = totalground;
		this.sevenGround = sevenGround;
		this.priceSevenGround = priceSevenGround;
		this.fiveGround = fiveGround;
		this.priceFiveGround = priceFiveGround;
		this.elevenGround = elevenGround;
		this.priceElevenGround = priceElevenGround;
		this.haveClothShop = haveClothShop;
		this.haveCanteen = haveCanteen;
		this.isFull = isFull;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public double getPriceSevenGround() {
		return priceSevenGround;
	}



	public void setPriceSevenGround(double priceSevenGround) {
		this.priceSevenGround = priceSevenGround;
	}



	public double getPriceFiveGround() {
		return priceFiveGround;
	}



	public void setPriceFiveGround(double priceFiveGround) {
		this.priceFiveGround = priceFiveGround;
	}



	public int getElevenGround() {
		return elevenGround;
	}



	public void setElevenGround(int elevenGround) {
		this.elevenGround = elevenGround;
	}



	public double getPriceElevenGround() {
		return priceElevenGround;
	}



	public void setPriceElevenGround(double priceElevenGround) {
		this.priceElevenGround = priceElevenGround;
	}



	public String getStadiumName() {
		return stadiumName;
	}


	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public Account getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(Account ownerName) {
		this.ownerName = ownerName;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getStadiumID() {
		return stadiumID;
	}

	public void setStadiumID(String stadiumId) {
		this.stadiumID = stadiumId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public int getTotalground() {
		return totalground;
	}

	public void setTotalground(int totalground) {
		this.totalground = totalground;
	}

	public int getSevenGround() {
		return sevenGround;
	}

	public void setSevenGround(int sevenGround) {
		this.sevenGround = sevenGround;
	}

	public int getFiveGround() {
		return fiveGround;
	}

	public void setFiveGround(int fiveGround) {
		this.fiveGround = fiveGround;
	}


	public boolean isHaveClothShop() {
		return haveClothShop;
	}

	public void setHaveClothShop(boolean haveClothShop) {
		this.haveClothShop = haveClothShop;
	}

	public boolean isHaveCanteen() {
		return haveCanteen;
	}

	public void setHaveCanteen(boolean haveCanteen) {
		this.haveCanteen = haveCanteen;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	
	

}
