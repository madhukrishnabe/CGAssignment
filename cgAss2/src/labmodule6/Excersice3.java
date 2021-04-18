package labmodule6;

import java.util.*;
import java.util.Map.Entry;

public class Excersice3 {
	public static HashMap<Integer,Integer> getSquare(int[] arr)
	{
		HashMap<Integer,Integer> hello = new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			hello.put(i, i*i);
		}
		return hello;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		HashMap<Integer,Integer> hello = new HashMap<Integer,Integer>();
		System.out.println(getSquare(arr));
		
		}


}
