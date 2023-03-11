package javaIntroduction;
//inteiros
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		int x = ent.nextInt();
		System.out.println("Voce digitou o numero: " + x);
		ent.close();
		
	}

}
