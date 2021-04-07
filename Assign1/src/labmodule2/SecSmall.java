package labmodule2;

import java.util.Scanner;

public class SecSmall {
	int getSecSmallo(int[] arr,int size)
		{
			int t;
			for(int i=0;i<size;i++)
			{
				for(int j= i+1;j<size;j++)
				{
					if (arr[i]>arr[j])
					{
							t=arr[i];
							arr[i]=arr[j];
			                arr[j]=t;
					}
				}
			}
			return arr[1];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		int size=ab.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
		arr[i]=ab.nextInt();	
		}
		SecSmall hello=new SecSmall();
		System.out.println(hello.getSecSmallo(arr,size));
	}

}
