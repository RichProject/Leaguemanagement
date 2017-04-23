package Leaguemanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.AccountDAO;
import Leaguemanagement.Entity.Account;
import Leaguemanagement.Modal.accountModal;


@Service("accountService")
public class accountService {

	
	@Autowired
	private AccountDAO accountDao;
	

	public Account login(accountModal accountmodal){
		//Account account = accountDao.findOne(id);
		Account account = accountDao.login(accountmodal.getUsername());
		
		
		if(account == null) {
			System.out.println("Account do not exist....");
			return null;
		}
		else {
			if (account.getPassword().equalsIgnoreCase(accountmodal.getPassword())){
				System.out.println("Login success...!");
				return account;
			}
			else {
				System.out.println("Login failed...!");
				return null;
			}
		}
	}
	public Account register(accountModal accountmodal){
		
		long a=3;
		System.out.println(accountmodal.getFullname());
		Account account  = accountDao.findOne(a);
		account.setFullname(accountmodal.getFullname());
		account.setPassword(accountmodal.getPassword());
		account.setPhoneNumber(accountmodal.getPhoneNumber());
		System.out.println("asdads");
		accountDao.save(account);
		
		return account;
	}
}
