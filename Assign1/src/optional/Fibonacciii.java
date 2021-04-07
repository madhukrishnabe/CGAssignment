package optional;

import java.util.Scanner;

public class Fibonacciii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ab= new Scanner(System.in);
			int n= ab.nextInt();
			int n1=1,n2=1,m;
			System.out.print(n1+" "+n2+" ");
			for(int i=2;i<n;++i)
			{
			m=n1+n2;
			System.out.print(m+" ");
			n1=n2;
			n2=m;
			}

	}

}
