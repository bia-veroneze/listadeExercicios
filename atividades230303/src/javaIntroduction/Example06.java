package javaIntroduction;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros do usuário e exibe sua multiplicação
public class Example06 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite dois numeros Inteiros para multiplicar: ");
		
		int a = ent.nextInt();
		int b = ent.nextInt();
		
		int c = a*b;
		
		System.out.println("O resultado da multiplicacao de " + a +" e " + b +" é igual a: " + c);
		
		ent.close();
	}

}
