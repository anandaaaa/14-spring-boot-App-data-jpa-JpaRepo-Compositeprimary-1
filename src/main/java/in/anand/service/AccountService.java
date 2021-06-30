package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.Entity.Account;
import in.anand.Entity.AccountPk;
import in.anand.Repo.AccountRepo;

@Service
public class AccountService {
	
	private AccountRepo accrepo;

	@Autowired
	public AccountService(AccountRepo accrepo) {
		super();
		this.accrepo = accrepo;
	}
	
	public void saveData()
	{
		
		
		
		Account acc=new Account();
		acc.setBranchName("machilipatnam");
		acc.setAccount_ID(1);
		acc.setAccount_Type("saving");
		acc.setHolder_Name("IBM1");
		acc.setMinBal(500);
	
		accrepo.save(acc);
		
	}
	
	
}
