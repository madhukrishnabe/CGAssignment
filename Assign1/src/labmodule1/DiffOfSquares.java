package labmodule1;
import java.util.*;
public class DiffOfSquares {
	int calculateDifference(int n)
	{
	int a=0,b=0,diff,c;
	for(int i=1;i<=n;i++)
	{
	a=a+(i*i);
	b=b+i;
	}
	c=b*b;
	diff=Math.abs(a-c);
	return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner ab=new Scanner(System.in);
		  int n= ab.nextInt();
		  DiffOfSquares find=new DiffOfSquares();
		  System.out.println(find.calculateDifference(n));

	}

}
