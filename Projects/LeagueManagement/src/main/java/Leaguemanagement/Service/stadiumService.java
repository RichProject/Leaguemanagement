package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.AccountDAO;
import Leaguemanagement.DAO.StadiumDAO;
import Leaguemanagement.Entity.Account;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Stadium;
import Leaguemanagement.Modal.StadiumModal;

@Service("stadiumService")
public class stadiumService {

	
	@Autowired
	private StadiumDAO stadiumDao;
	
	@Autowired
	private AccountDAO accountDao;
	
	public List<Stadium> getAll(){
		List<Stadium> listStadium = new ArrayList<Stadium>();
		listStadium= stadiumDao.findAll();
		listStadium.remove(0);
		return listStadium;
	}
	
	public Stadium addStadium(StadiumModal stadiummodal){
		
		try{
			Stadium stadium = new Stadium();
			Account account = accountDao.login(stadiummodal.getOwnerID());
			stadium.setOwnerName(account);
			stadium.setStadiumID("STD"+stadiumDao.count());
			stadium.setStadiumName(stadiummodal.getStadiumName());
			stadium.setAddress(stadiummodal.getAddress());
			stadium.setDistrict(stadiummodal.getDistrict());
			stadium.setWard(stadiummodal.getWard());
			stadium.setNote("note");
			stadium.setStatus("available");
			stadium.setPointReview(3);
			stadium.setTotalground(stadiummodal.getSevenGround()+stadiummodal.getFiveGround()+stadiummodal.getElevenGround());
			stadium.setSevenGround(stadiummodal.getSevenGround());
			stadium.setFiveGround(stadiummodal.getFiveGround());
			stadium.setElevenGround(stadiummodal.getElevenGround());
			stadium.setPriceFiveGround(stadiummodal.getPriceFiveGround());
			stadium.setPriceSevenGround(stadiummodal.getPriceSevenGround());
			stadium.setPriceElevenGround(stadiummodal.getPriceElevenGround());
			stadium.setHaveCanteen(true);
			stadium.setHaveClothShop(false);
			
			stadiumDao.save(stadium);
			return stadium;
		}catch(Exception e){
			return null;
		}
		
	}
}
