package labmodule9;

import java.util.Scanner;

public class StringSpace {
	@FunctionalInterface
	interface if1{
		String m1(String str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if1 m=(str) -> {
			String res="";
			for(int i=0;i<s.length();i++)
		    {
			  res=res+s.charAt(i);
			  if(i==s.length()-1)
			  {
				  break;
			  }
			  res=res+" ";
		    }
			return res;
		};
		System.out.println(m.m1(s));

	}

}
