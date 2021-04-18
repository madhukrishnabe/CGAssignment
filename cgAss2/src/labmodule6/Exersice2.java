package labmodule6;

import java.util.TreeMap;

public class Exersice2 {
	public static TreeMap<Character,Integer> getCount(char[] arr)
	{
	    TreeMap<Character,Integer> ship =new TreeMap<Character,Integer>();
		for(char c:arr)
		{
			if(ship.containsKey(c))
			{
			  ship.put(c,ship.get(c) + 1);
			}
			else
			{
			  ship.put(c, 1);	
			}
		}
		return ship;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','m','a','c','f','m','z'};
		System.out.println(getCount(arr));
		}

}
