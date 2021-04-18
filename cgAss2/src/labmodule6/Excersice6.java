package labmodule6;

import java.util.*;

public class Excersice6 {

     public static void main(String args[]) throws Exception {
			HashMap<Integer, Integer> map = new HashMap();
			map.put(1, 1998);
			map.put(2, 1993);
			map.put(3, 2004);
			map.put(4, 1970);
			map.put(5, 2004);
			map.put(6, 1960);
			map.put(7, 1994);
			map.put(8, 2000);
			System.out.println(votersList(map));
		}
		public static List votersList(HashMap<Integer,Integer> map) throws Exception {
			List<Integer> result = new ArrayList();
			Set keys = map.keySet();
			Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				Integer key = (Integer) iterator.next();
				if((Math.abs(map.get(key)-2021))>=18)
				{
					result.add(key);
				}
			}
            return result;
		}
		
	}
