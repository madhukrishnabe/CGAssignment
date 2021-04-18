package labmodule4;

import java.util.Scanner;

public class JournalPaper extends WrittenItem {
	private int year_pub;
	/*JournalPaper(int year_pub){
		super();
		this.year_pub=year_pub;
	}*/
	public int getYear_pub() {
		return year_pub;
	}
	public void setYear_pub(int year_pub) {
		this.year_pub = year_pub;
	}
	public JournalPaper()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("get year");
		setYear_pub(sc.nextInt());
	}
	public void print()
	{
		super.print();
	System.out.println(getYear_pub());	
	}

}
