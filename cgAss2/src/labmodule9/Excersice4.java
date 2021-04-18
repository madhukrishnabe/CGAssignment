package labmodule9;

import java.util.Scanner;

@FunctionalInterface
interface i1{
	int helo(int x);
}
public class Excersice4 {
	static int numUpto(int x)
	{
		int s=0;
		while(x>0)
		{
			s+=x;
			x--;
			//System.out.println(s);
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Excersice4 joy=new Excersice4();
		i1 k= Excersice4::numUpto;
		System.out.println(k.helo(n));
		

	}

}
