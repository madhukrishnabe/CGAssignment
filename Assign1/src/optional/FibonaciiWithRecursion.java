package optional;

import java.util.Scanner;

public class FibonaciiWithRecursion {
		static int n1=1,n2=1,n3=0;
		static void recursionn (int n){    
		   if(n>0){    
		        n3 = n1 + n2;    
		        n1 = n2;    
		        n2 = n3;    
		        System.out.print(" "+n3);  
		       recursionn(n-1);    
		    }    
		}    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab= new Scanner(System.in);
		 int n= ab.nextInt();  
		 System.out.print(n1+" "+n2);
		 recursionn(n-2);


	}

}
