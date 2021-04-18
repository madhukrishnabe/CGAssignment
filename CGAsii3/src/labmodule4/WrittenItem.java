package labmodule4;

import java.util.Scanner;

public abstract class WrittenItem extends Item {
	private String author;
	WrittenItem(String author)
	{
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public WrittenItem()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("get author:");
		setAuthor(sc.next());
	}
	public void print()
	{
		super.print();;
		System.out.println(getAuthor());
	}
	

}
