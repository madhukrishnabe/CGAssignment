package labmodule10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exersice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fi=new FileReader("C:\\Users\\madhu\\OneDrive\\Documents\\sourcef.txt");
		BufferedReader bi=new BufferedReader(fi);
        String l;
        int c=1;
        l = bi.readLine();
        while(l!=null)
        {
        	
        	System.out.println(c+" "+l);
        	l=bi.readLine();
        	c++;
        }
        fi.close();
        }
	}


