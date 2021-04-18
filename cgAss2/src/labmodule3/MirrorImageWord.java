package labmodule3;

import java.util.Scanner;

public class MirrorImageWord {
		String rev="";
		
    public String getImage(String s) {
			int l=s.length();
			for(int i=l-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			}
			System.out.println(s+" | "+rev);
			return s;
			
			
		}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   String s=sc.next();
	   MirrorImageWord p =new MirrorImageWord();
	   p.getImage(s);

	
	}
}
