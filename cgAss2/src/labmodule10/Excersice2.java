package labmodule10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excersice2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi=new File("C:\\Users\\madhu\\OneDrive\\Documents\\sourcef.txt");
		System.out.println(fi.exists()?true:false);
		System.out.println(fi.canRead()?true:false);
		System.out.println(fi.canWrite()?true:false);
		System.out.println(fi.length());
		System.out.println(fi.getName());
		

	}

}
