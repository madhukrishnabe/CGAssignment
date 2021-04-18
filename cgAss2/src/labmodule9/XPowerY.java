package labmodule9;

import java.util.Scanner;

public class XPowerY {
	@FunctionalInterface
	interface if1{
	int powerOf(int x,int y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hc=new Scanner(System.in);
		int a=hc.nextInt();
		int b=hc.nextInt();
	    if1 i =(x,y) ->{return (int) Math.pow(a, b);};
	    System.out.println(i.powerOf(a,b));

	}

}
