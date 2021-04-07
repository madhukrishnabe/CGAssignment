package labmodule1;
import java.util.*;
public class SumDivBy {
	int calculateSum(int n)
	{
		int sum=0;
		for (int i=1;i<=n;i++)
		{
		  if(i%3==0)
		  {
		    sum=sum+i;
		  }
		  else if(i%5==0)
		  {
		    sum=sum+i;
		  }
		  else
		    continue;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab = new Scanner(System.in);
		int n= ab.nextInt();
		SumDivBy me=new SumDivBy();
		System.out.println(me.calculateSum(n));

	}

}
