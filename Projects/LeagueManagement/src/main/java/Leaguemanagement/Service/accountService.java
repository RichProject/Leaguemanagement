package Leaguemanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Leaguemanagement.DAO.AccountDAO;
import Leaguemanagement.Entity.Account;
import Leaguemanagement.Modal.accountModal;
import Leaguemanagement.Utilities.AccountUltility;


@Service("accountService")
public class accountService {

	
	@Autowired
	private AccountDAO accountDao;
	

	public accountModal login(accountModal accountmodal){
		//Account account = accountDao.findOne(id);
		Account account = accountDao.login(accountmodal.getUsername());
		accountmodal = AccountUltility.EntitytoModal(account);
		
		if(account == null) {
			System.out.println("Account do not exist....");
			return null;
		}
		else {
			if (account.getPassword().equalsIgnoreCase(accountmodal.getPassword())){
				System.out.println("Login success...!");
				return accountmodal;
			}
			else {
				System.out.println("Login failed...!");
				return null;
			}
		}
	}
	public Account register(accountModal accountmodal){
		Account account  = AccountUltility.ModaltoEnity(accountmodal);
		accountDao.save(account);
		return account;
	}
}
