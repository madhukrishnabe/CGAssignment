package labmodule9;

import java.util.Scanner;

public class UserNamePass {
	@FunctionalInterface
	interface i2
	{
		boolean check(String uname,String password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String org_username="Madhu";
		String org_pass="Cp#zxcvb";
		String username=sc.next();
		String pass=sc.next();
		i2 j = (uname ,password) -> org_username.equals(username) && org_pass.equals(pass)? true:false;
		System.out.println(j.check(org_username,org_pass));
		

	}

}
