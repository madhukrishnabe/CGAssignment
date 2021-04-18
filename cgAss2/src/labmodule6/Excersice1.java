package labmodule6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Excersice1 {
	public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> cool)
    {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {
            
                  // return comparison results of values of
                  // two keys
                  public int compare(K k1, K k2)
                  {
                      int comp = cool.get(k1).compareTo(
                          cool.get(k2));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
            
              };
        
        // SortedMap created using the comparator
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(cool);
        
        return sorted;
    }
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> k = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		TreeMap<Integer, Integer> cool = new TreeMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			k.add(sc.nextInt());
			v.add(sc.nextInt());
			cool.put(k.get(i), v.get(i));
		}
		Map sortedMap = valueSort(cool);
		Set set = sortedMap.entrySet();
  
        // Get an iterator
        Iterator i = set.iterator();
  
        // Display elements
        while (i.hasNext()) {
            
            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());
		
	     
}
}
}
