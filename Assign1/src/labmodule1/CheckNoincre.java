package labmodule1;
import java.util.*;
public class CheckNoincre {
	boolean checkNumber(int n)
	{
	int current;
	boolean flag=true;
	while(n>0)
	{
	current=n%10;
	n=n/10;
	if(current<n%10)
	{
	flag=false;
	break;
	}
	current=n%10;
	n=n/10;
	}
	return flag;
	}

	public static void main(String[] args) {
		Scanner ab= new Scanner(System.in);
		int n= ab.nextInt();
		CheckNoincre help = new CheckNoincre();
		System.out.println(help.checkNumber(n));

	}

}
