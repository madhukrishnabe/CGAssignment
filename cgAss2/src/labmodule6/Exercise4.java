package labmodule6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise4 {
	public static  HashMap <Integer,String> getMedals(HashMap<Integer,Integer> cool)
	{
		HashMap <Integer,String> fool = new HashMap();
		Set<Integer> l=cool.keySet();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Integer k=(Integer)itr.next();
			Integer m=(Integer)cool.get(k);
			if(m>=90)
			{
				fool.put(m,"Gold");
			}
			else if(m>=80 && m<90)
			{
				fool.put(m,"Silver");
			}
			else
			{
				fool.put(m, "Bronze");
			}
		}
		return fool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,Integer> cool = new HashMap<Integer,Integer>();
		cool.put(100, 98);
		cool.put(101, 80);
		cool.put(102, 70);
		cool.put(103, 82);
		cool.put(104, 100);
		System.out.println(getMedals(cool));
		}

}
