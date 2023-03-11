package sequencial;
/*
 Faça um programa que tenha três variáveis inteiras. Atribua valores a duas delas e realize a
soma de ambas atribuindo o resultado à terceira variável. Ao final, escreva o valor da soma.
 */

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("valor a ser atribuiodo: ");
		int valor1 = ent.nextInt();
		
		System.out.println("valor a ser atribuido: ");
		int valor2 = ent.nextInt();
		
		int valor3 = valor1+valor2;
		
		System.out.println("O resultado da soma é: " + valor3);
		
		ent.close();
	}

}
