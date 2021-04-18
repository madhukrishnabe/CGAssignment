package labmodule6;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Excersice5 {
	public static void getSorted(Integer[] a,Integer m)
	{
		List<Integer>li=Arrays.asList(a);
		Collections.sort(li);
		Integer n=li.get(1);
	    System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {5,7,9,3,2,10};
		Integer m=a.length;
		getSorted(a,m);

	}

}
