package labmodule5;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hi=new Scanner(System.in);
		int salary=hi.nextInt();
		try
		{
			toCheck(salary);
		}
		catch(Exception m)
		{
			System.out.println(m.getMessage());
		}

	}

	private static void toCheck(int salary) throws EmployeeException{
		// TODO Auto-generated method stub
		if(salary<3000)
		{
			throw new EmployeeException("Exception handled");
		}
		else
		{
			System.out.println(salary);
		}

	}

}
