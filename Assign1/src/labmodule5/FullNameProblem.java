package labmodule5;

import java.util.Scanner;

public class FullNameProblem {

	public static void main(String[] args) {
            Scanner ab=new Scanner(System.in);
			String string1 = ab.next();
			String string2 = ab.next();
			//String string1 = null;
			//String string2 =null;
			try
			{
				getFullName(string1,string2);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}

		private static void getFullName(String string1, String string2)throws FullNameException {
			if((string1!=null)&&(string2!=null))
			{
				System.out.println("FullName:"+string1+" "+string2);
			}
			else
			{
				throw new FullNameException("Enter ur name");
			}
			
			
		}

}

