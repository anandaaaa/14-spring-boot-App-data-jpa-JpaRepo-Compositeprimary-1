package in.anand.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.Entity.Account;
import in.anand.Entity.AccountPk;

public interface AccountRepo extends JpaRepository<Account,AccountPk>{

}
