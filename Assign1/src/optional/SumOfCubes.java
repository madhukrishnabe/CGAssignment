package optional;

import java.util.Scanner;

public class SumOfCubes {
		int cubesum(int n)
		{
		int m,sum=0;
		while(n>0)
		{
		m=n%10;
		sum=sum+(m*m*m);
		n=n/10;
		}
		return sum;
		}
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner ab= new Scanner(System.in);
			int n= ab.nextInt();
			SumOfCubes helloo=new SumOfCubes();
			System.out.println(helloo.cubesum(n));
	}

}
