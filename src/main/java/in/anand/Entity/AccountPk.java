package in.anand.Entity;

import java.io.Serializable;

public class AccountPk implements Serializable {
	
	private Integer Account_ID;
	private String Account_Type;
	private String Holder_Name;
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
		return "AccountPk [Account_ID=" + Account_ID + ", Account_Type=" + Account_Type + ", Holder_Name=" + Holder_Name
				+ "]";
	}
	
	

}
