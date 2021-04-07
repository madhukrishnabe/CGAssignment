package labmodule1;
import java.util.*;
public class PowOf2 {
	boolean checkNumber(int n)
	{
	while(n%2==0)
	{
	n=n/2;
	}
	if(n==1)
	{
	return true;
	}
	else
	{
	return false;
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		PowOf2 hey=new PowOf2();
		System.out.println(hey.checkNumber(n));
  }
}
