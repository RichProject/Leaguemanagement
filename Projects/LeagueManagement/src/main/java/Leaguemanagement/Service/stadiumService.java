package Leaguemanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.StadiumDAO;
import Leaguemanagement.Entity.Game;
import Leaguemanagement.Entity.Stadium;

@Service("stadiumService")
public class stadiumService {

	
	@Autowired
	private StadiumDAO stadiumDao;
	
	public List<Stadium> getAll(){
		List<Stadium> listStadium = new ArrayList<Stadium>();
		listStadium= stadiumDao.findAll();
		return listStadium;
	}
	
	public boolean addStadium(Stadium stadium){
		try{
		stadiumDao.save(stadium);
		}catch(Exception e){
			return false;
		}
		return true;
	}
}
