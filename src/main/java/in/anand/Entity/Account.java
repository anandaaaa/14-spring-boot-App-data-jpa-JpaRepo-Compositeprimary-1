package in.anand.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCT")
@IdClass(AccountPk.class)
public class Account {
	@Column(name="BRANCH_NAME")
	private String branchName;
	@Column(name="MIN_BAL")
	private float minBal;
	
	@Id
	private Integer Account_ID;
	@Id
	private String Account_Type;
	@Id
	private String Holder_Name;
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public float getMinBal() {
		return minBal;
	}
	public void setMinBal(float minBal) {
		this.minBal = minBal;
	}
	public Integer getAccount_ID() {
		return Account_ID;
	}
	public void setAccount_ID(Integer account_ID) {
		Account_ID = account_ID;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getHolder_Name() {
		return Holder_Name;
	}
	public void setHolder_Name(String holder_Name) {
		Holder_Name = holder_Name;
	}
	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", Account_ID=" + Account_ID
				+ ", Account_Type=" + Account_Type + ", Holder_Name=" + Holder_Name + "]";
	}
	
	
	
	
}
