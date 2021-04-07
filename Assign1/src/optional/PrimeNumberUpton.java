package optional;

import java.util.Scanner;

public class PrimeNumberUpton {
	static boolean printPrime(int n)
	{
	for (int i = 2; i < n; i++)
	   if (n % i == 0)
	       return false;

	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ab= new Scanner(System.in);
		 int n= ab.nextInt();
		 printPrime(n);
		 for (int i = 2; i <= n; i++)
		 {
		     if (printPrime(i))
		         System.out.print(i + " ");
		 }
		 }
		 

	}

