package javaIntroduction;
// no input coloque com ' , ' se nn vai dar erro
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		double x = ent.nextDouble();
		System.out.println("Voce digitou o double: "+ x);
		
		ent.close();
	}

}
