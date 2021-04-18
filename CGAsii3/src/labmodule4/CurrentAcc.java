package labmodule4;

public class CurrentAcc extends Account{
	long overdraft=5000;
	CurrentAcc(){}
	CurrentAcc(long accNum,double balance){
		super();
	}
	boolean withdraw(int amt)
	{
		if(amt>overdraft)
		{
			return false;
		}
		else
		{
		    return true;
		}
	}

}
