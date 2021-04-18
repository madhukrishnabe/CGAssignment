package labmodule4;

public class Account  {
	private long accNum;
	private static double balance;
	private person acc_holder;
	Account(){}
	Account(long accNum,double balance,person acc_holder)
	{
		this.accNum=accNum;
		this.balance=balance;
		this.acc_holder=acc_holder;
	}
	public person getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(person acc_holder) {
		this.acc_holder = acc_holder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	static double getBalance() {
		return balance;
	}
	protected double setBalance(double balance) {
		return this.balance = balance;
	}
	void deposit(double b)
	{
		this.balance+=b;
	}
	void withdraw(double b)
	{
		this.balance-=b;
	}
	

}
