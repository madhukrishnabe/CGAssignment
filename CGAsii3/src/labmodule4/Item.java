package labmodule4;

import java.util.Scanner;

public abstract class Item {
	private int id_no;
	private String title;
	private int copy;
	Item(int id_no,String title,int copy){
		super();
		this.id_no=id_no;
		this.title=title;
		this.copy=copy;
	}
	public int getId_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int copy) {
		this.copy = copy;
	}
	public Item()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("get id");
		setId_no(sc.nextInt());
		System.out.println("get title");
		setTitle(sc.next());
		System.out.println("get copy");
		setCopy(sc.nextInt());
		
	}
	public void print()
	{
		System.out.println(getId_no());
		System.out.println(getTitle());
		System.out.println(getCopy());
		
	}
	

}
