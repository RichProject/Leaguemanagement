package Leaguemanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Leaguemanagement.DAO.AccountDAO_BT2;
import Leaguemanagement.Entity.Account_BT2;
import Leaguemanagement.Modal.accountModal_BT2;

@Service("accountService_BT2")
public class accountService_BT2 {
	
	@Autowired
	private AccountDAO_BT2 accountDao;
	
	public accountModal_BT2 login(accountModal_BT2 accountModal_BT2){

		Account_BT2 account1 = accountDao.login(accountModal_BT2.getUsername());
		
		
		
		if(account1 == null) {
			System.out.println("Account do not exist....");
			return null;
		}
		else {
			if (accountModal_BT2.getPassword().equalsIgnoreCase(account1.getPassword())){
				System.out.println("Login success...!");
				accountModal_BT2.setLogintime(account1.getLogintime());
				account1.setLogintime(account1.getLogintime()+1);
				accountDao.save(account1);
				return accountModal_BT2;
			}
			else {
				System.out.println("Login failed...!");
				return null;
			}
		}
	}
}
