package labmodule3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringsCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 int nl=1;
		  int nw=0;           
	      int ch=0;
	      FileInputStream f= new FileInputStream("C:\\Users\\madhu\\OneDrive\\Documents\\sourcef.txt");
	      InputStreamReader in=new InputStreamReader(f);
	      BufferedReader b=new BufferedReader(in);
	      String l;
	      while((l = b.readLine()) != null)
	      {
	                  
	                  if(l.equals('\n'))
	                  {
	                       nl++;
	                  }
	                  else
	                  {
	                       ch+=l.length();
	                       String[] wordc=l.split("\\s+");
	                       nw+=wordc.length;
	                  }                                  
	      }
	      if(f!=null) {
				f.close();
			}
	      System.out.println("\nNumber of lines : "+nl);
	      System.out.println("\nNumber of words : "+(nl+nw));
	      System.out.println("\nNumber of characters : "+ch);
	}

    }
