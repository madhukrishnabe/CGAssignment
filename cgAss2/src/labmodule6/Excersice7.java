package labmodule6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Excersice7 {
	public static void getSorted(Integer[] arr,int m)
	{
		List<Integer> l=Arrays.asList(arr);
		List<Integer> rev=new ArrayList<Integer>();
		for(int i=l.size()-1;i>=0;i--)
		{
			rev.add(l.get(i));
		}
		Collections.sort(rev);
		for(int i=0;i<rev.size();i++)
		{
			System.out.println(rev.get(i));
		}
			
	}
	public static void main(String args[])
	{
			Integer[] a= {5,7,9,3,2,10};
			Integer m=a.length;
			getSorted(a,m);
	}

}
