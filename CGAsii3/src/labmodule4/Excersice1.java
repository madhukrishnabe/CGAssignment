package labmodule4;

public class Excersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long balance =0;
		person p1=new person("Madhu",22);
		person p2=new person("Krishna",23);
		Account a1=new Account(11111,5000,p1);
		Account a2=new Account(11112,5000,p2);
		a1.deposit(5000);
		a2.deposit(5000);
		a1.withdraw(1000);
		a2.withdraw(2000);
		System.out.println(p1.getName()+" age "+p1.getAge()+" account no: "+a1.getAccNum()+" has a balance: "+a1.getBalance());
		System.out.println(p2.getName()+" age "+p2.getAge()+" account no: "+a2.getAccNum()+" has a balance: "+a2.getBalance());
		CurrentAcc m=new CurrentAcc();
		System.out.println(m.withdraw(1000));
		SavingsAccount s=new  SavingsAccount();
		//System.out.print(s.withdraw(1000));
	}

}
