package labmodule4;

public class SavingsAccount extends Account {
	final double min_bal=500;
	SavingsAccount() {}
	SavingsAccount(long accNum,double balance,person acc_holder) {
		super();
	}
	
		//Account db = new SavingsAccount();
		
	void withdraw(int amt) {
		if(Account.getBalance()>min_bal)
			this.setBalance(this.getBalance()-amt);
	}
	}

