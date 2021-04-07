package labmodule5;
import java.util.*;
public class AgeProblem {
		static void toValidate(int age) throws AgeValidateException
		{
			if(age<18)
				throw new AgeValidateException ("not valid");
			else
				System.out.println("Welcome");
		}
		

		public static void main(String[] args) {
			Scanner ab=new Scanner(System.in);
			int n=ab.nextInt();
			try {
				toValidate(n);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			}
		

	}
