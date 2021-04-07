package optional;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab= new Scanner(System.in);
		String str = ab.nextLine();
		switch(str)
		{
		case "red":
		System.out.println("Stop");
		break;
		case "yellow":
		System.out.println("Ready");
		break;
		case "green":
		System.out.println("Go");
		break;
		}

		}

	}
