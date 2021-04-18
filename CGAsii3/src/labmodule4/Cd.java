package labmodule4;

import java.util.Scanner;

public class Cd extends MediaItem {
	private String artist;
	private String genre;
	Cd(String artist,String genre){
		super();
		this.artist=artist;
		this.genre=genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Cd()
	{
		super();
		Scanner sc= new Scanner(System.in);
		System.out.println("get artist");
		setArtist(sc.next());
		System.out.println("get genre");
		setGenre(sc.next());
		
	}
	public void print()
	{
		super.print();
		System.out.println(getArtist());
		System.out.println(getGenre());
	

}}
