package javaIntroduction;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		String s = ent.nextLine(); 
		System.out.println("Helloo World "+ s);
		
		ent.close();
	}

}
