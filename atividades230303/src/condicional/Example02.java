package condicional;

import java.util.Scanner;

/*
 Elabore um programa que leia do teclado o nome e idade de uma pessoa e informe se ela está apta ou
não tirar a CNH
 */

public class Example02 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("digite sua idade: ");
		int idade = ent.nextInt();

		if (idade >= 18) {
			System.out.println("apto para tirar CNH");
		} else if (idade < 18 && idade >= 0) {
			System.out.println("menor de idade ");
		}else {
			System.out.println("idade invalida");
		}

		ent.close();
	}

}
