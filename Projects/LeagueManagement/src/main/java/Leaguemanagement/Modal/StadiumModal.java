package Leaguemanagement.Modal;

public class StadiumModal {

	
	
	private String stadiumName;
	
	private String ownerID;
	
	private String address;

	private String district;

	private String ward;

	private int sevenGround;

	private double priceSevenGround;

	private int fiveGround;

	private double priceFiveGround;

	private int elevenGround;

	private double priceElevenGround;
	
	

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public StadiumModal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StadiumModal(String stadiumName, String address, String district, String ward, int sevenGround,
			double priceSevenGround, int fiveGround, double priceFiveGround, int elevenGround,
			double priceElevenGround) {
		super();
		this.stadiumName = stadiumName;
		this.address = address;
		this.district = district;
		this.ward = ward;
		this.sevenGround = sevenGround;
		this.priceSevenGround = priceSevenGround;
		this.fiveGround = fiveGround;
		this.priceFiveGround = priceFiveGround;
		this.elevenGround = elevenGround;
		this.priceElevenGround = priceElevenGround;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
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

	public int getSevenGround() {
		return sevenGround;
	}

	public void setSevenGround(int sevenGround) {
		this.sevenGround = sevenGround;
	}

	public double getPriceSevenGround() {
		return priceSevenGround;
	}

	public void setPriceSevenGround(double priceSevenGround) {
		this.priceSevenGround = priceSevenGround;
	}

	public int getFiveGround() {
		return fiveGround;
	}

	public void setFiveGround(int fiveGround) {
		this.fiveGround = fiveGround;
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
	
	
}
