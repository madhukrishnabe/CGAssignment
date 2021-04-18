package labmodule4;

import java.util.Scanner;

public class Video extends MediaItem {
	private String director;
	private String genre;
    private int year;
    Video (String director,String genre,int year){
    	super();
    	this.director=director;
    	this.genre=genre;
    	this.year=year;
    }
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Video()
	{
		super();
		Scanner sc= new Scanner(System.in);
		System.out.println("get director");
		setDirector(sc.next());
		System.out.println("get genre");
		setGenre(sc.next());
		System.out.println("get year");
		setYear(sc.nextInt());
		
	}
	public void print()
	{
		super.print();
		System.out.println(getGenre());
		System.out.println(getGenre());
		System.out.println(getYear());
		
	}
	
    
}
