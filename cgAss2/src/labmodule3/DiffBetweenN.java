package labmodule3;

import java.util.Scanner;

public class DiffBetweenN {
	public static int getModifyNum(int n)
	{
		StringBuffer b=new StringBuffer();
		String s=Integer.toString(n);
		for(int i=0;i<s.length()-1;i++)
		{
			int t=(int)Math.abs(s.charAt(i)-s.charAt(i+1));
			b.append(t);
		}
		b.append(s.length()-1);
		System.out.println(b);
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		DiffBetweenN hello=new DiffBetweenN();
		hello.getModifyNum(n);
	}

}
