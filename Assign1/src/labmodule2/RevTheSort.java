package labmodule2;

import java.util.Scanner;

public class RevTheSort {
	int[] getSort(int[] b,int size)///////////int[]
	{
		int t;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(b[i]>b[j])
				{
				t=b[i];
				b[i]=b[j];
				b[j]=t;
				}
			}
				
		}
	return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc=new Scanner(System.in);
		int size=abc.nextInt();
		int[] arr=new int[size];
		int[] b=new int[size];
		int l=size;
		for(int i=0;i<size;i++)
		{
			arr[i]=abc.nextInt();
		}
		for(int k=0;k<size;k++)
		{
		    b[l-1]=arr[k];
		    l--;
		}
		RevTheSort cool=new RevTheSort();
		cool.getSort(b,size);
		for(int n:cool.getSort(b,size))
		{
			System.out.print(n+" ");
		}
	}

	}
