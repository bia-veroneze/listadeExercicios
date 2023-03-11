package javaIntroduction;

import java.util.Scanner;

//Faça um algoritmo que leia o nome e a idade de uma pessoa e exiba a informação na tela
public class Example07 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite seu nome");
		String name = ent.nextLine();
		
		System.out.println("Digite sua idade");
		int age = ent.nextInt();
		
		System.out.println();
		System.out.println("Olá, "+name+"!! Voce tem " + age +" anos");
		
		ent.close();
		
	}

}
