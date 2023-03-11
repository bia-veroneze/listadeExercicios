package javaIntroduction;

import java.util.Scanner;

//Faça um algoritmo que atribua dois valores a duas variáveis inteiras e exiba a soma delas
public class Example05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		  
		System.out.println("digite dois numeros inteiros");
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		
		//int a + b = c;
		int c = a + b;
		//int a + b;
		
		System.out.println("a soma é: " + c);
		
		ent.close();
	}

}
