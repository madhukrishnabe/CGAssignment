package labmodule2;

import java.util.Arrays;

public class AlphabeticalSortt {
	public static void sortString(String[] str) {
		int n=str.length;
		for(int i=0;i<n;i++)
		{
			str[i]=str[i].toLowerCase();
		}
		Arrays.sort(str);
		if(n%2!=0)
		{
			int c=(n/2)+1;
			for(int j=0;j<c;j++)
			{
				str[j]=str[j].toUpperCase();
				System.out.println(str[j]+" ");
			}
			for(int j=c;j<n;j++)
			{
				str[j]=str[j].toLowerCase();
				System.out.println(str[j]+" ");
			}
		}
		else
		{
			int c=n/2;
			for(int j=0;j<c;j++)
			{
				str[j]=str[j].toUpperCase();
				System.out.println(str[j]+" ");
			}
			for(int j=c;j<n;j++)
			{
				str[j]=str[j].toLowerCase();
				System.out.println(str[j]+" ");
			}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabeticalSortt a=new AlphabeticalSortt();
		String[] str = { "red", "green", "blue", "white", "orange" };
        Arrays.sort(str);
		a.sortString(str);

	}

}
