package sequencial;
/*
 media simples de duas notas
 */

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("digite a primeira nota a ser atribuida: ");
		int valor1 = ent.nextInt();	
		
		System.out.println("digite a ssegunda nota a ser atribuida: ");
		int valor2 = ent.nextInt();
		
		int valor3 = (valor1+valor2)/2;
		
		System.out.println("A media é: "+ valor3);
		
		
		ent.close();
	
	}

}
