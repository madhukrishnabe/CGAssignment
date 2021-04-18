package labmodule9;

import java.util.Scanner;

@FunctionalInterface
interface if1{
int fac(int n);
}

public class FactorialNo {
	public int factooo(int n)
	{
		int sum=1;
		while(n>0)
		{
			sum=sum*n;
			n--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		FactorialNo cool=new FactorialNo();
		if1 m = cool::factooo;
		System.out.println(m.fac(a));

	}

}
