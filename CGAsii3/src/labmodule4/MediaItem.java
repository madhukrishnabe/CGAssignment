package labmodule4;

import java.util.Scanner;

public abstract class MediaItem extends Item {
	private int runtime;
	MediaItem(int runtime){
		super();
		this.runtime=runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public MediaItem()
	{
		super();
		Scanner sc= new Scanner(System.in);
		System.out.println("get runtime");
		setRuntime(sc.nextInt());
	}
	public void print()
	{
		super.print();
		System.out.println(getRuntime());
	}
	

}
