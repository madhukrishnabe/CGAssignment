package labmodule3;

import java.util.Scanner;

public class PositiveStringss {
	static boolean checkPosStrr(String str)
	{
		int n=str.length();
		for(int i=1;i<n;i++)
		{
			if(str.charAt(i) < str.charAt(i-1))
			{
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ou=new Scanner(System.in);
		String str=ou.nextLine();
		System.out.println(checkPosStrr(str));

	}

}
