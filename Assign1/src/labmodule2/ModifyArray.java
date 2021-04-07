package labmodule2;

import java.util.Arrays;

public class ModifyArray {
	public static int removeduplicates(int a[], int n)
    {
      if (n == 0 || n == 1) 
      {
      return n;
      }
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n - 1; i++)
    {
      if (a[i] != a[i + 1])
      {
        temp[j++] = a[i];
      }
// System.out.print(j);    
    }
    temp[j++] = a[n - 1];
    for (int i = 0; i < j; i++)
    {
    a[i] = temp[i];
    }
    System.out.println(j);
    return j;
   }
	

	public static void main(String[] args) {
		int a[] = {7,9,5,4,6,9,8,3,7,4};
		Arrays.sort(a);
		int b = a.length;
        b = removeduplicates(a, b);
        for (int i = 0; i < b; i++)
            System.out.print(a[i] + " ");
		// TODO Auto-generated method stub

	}

}
