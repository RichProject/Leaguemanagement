package Leaguemanagement.Utilities;

import Leaguemanagement.Entity.Account;
import Leaguemanagement.Modal.accountModal;

public class AccountUltility {
	
	
	
	
	public static accountModal EntitytoModal(Account account)
	{
		accountModal accountmodal = new accountModal();
		accountmodal.setFullname(account.getFullname());
		accountmodal.setPhoneNumber(account.getPhoneNumber());
		accountmodal.setId(account.getId());
		accountmodal.setPassword(account.getPassword());
		accountmodal.setUsername(account.getUsername());
		return accountmodal;
	}
	
	public static Account ModaltoEnity(accountModal accountmodal)
	{
		Account account= new Account();
		account.setFullname(accountmodal.getFullname());
		account.setPhoneNumber(accountmodal.getPhoneNumber());
		account.setId(accountmodal.getId());
		account.setPassword(accountmodal.getPassword());
		System.out.println(accountmodal.getId());
		account.setUsername(accountmodal.getUsername());
		return account;
	}
	

	
}
