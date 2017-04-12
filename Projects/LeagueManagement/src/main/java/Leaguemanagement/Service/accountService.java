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
	
	public void testaccount(){
		 long id = 3;
		
		Account account = accountDao.findOne(id);
		System.out.println(account.getUsername());
	}
	
	public Account login(accountModal accountmodal){
		System.out.println(accountmodal.getPassword());
		System.out.println(accountmodal.getUsername());
		System.out.println(accountmodal.getId());
		Account account = accountDao.login(accountmodal.getUsername());
		System.out.println(account.getPassword());
		System.out.println(account.getUsername());
		System.out.println(account.getID());
		
		if (accountmodal.getPassword().equalsIgnoreCase(account.getPassword()) ) return account;
		else return null;
	}
}
