package repeticao;

import java.util.Scanner;

/*
 Faça um programa que receba um número inteiro maior que 1, verifique se o número é
primo ou não e mostre a mensagem de número primo ou de número não primo. Obs: Um
número é primo quando é divisível apenas por 1 e por ele mesmo.
 */

public class Example01 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("digite um numero inteiro maior que 1: ");
		int valor = ent.nextInt();
		
		
		ent.close();
	}

}
