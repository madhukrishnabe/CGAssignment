package labmodule3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int sum=0;
		Scanner hi=new Scanner(System.in);
		String n=hi.nextLine();
		StringTokenizer s=new StringTokenizer(n," ");
		while(s.hasMoreTokens())
		{
		String p=s.nextToken();
		m=Integer.parseInt(p);
		sum+= m;
		}
		System.out.print(sum);

	}

}
