package condicional;

import java.util.Scanner;

/*
 Faça um programa que leia dois valores inteiros distintos e informe qual é o maior.
 */

public class Example01 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("digite o primeiro numero: ");
		double primeiro = ent.nextDouble(); 
		
		
		System.out.println("digite o segundo numero: ");
		double segundo = ent.nextDouble();
		
		if(primeiro>segundo){
			System.out.println("o maior numero é: "+ primeiro);
		}else if (segundo>primeiro) {
			System.out.println("o maior numero é: "+ segundo);
		}else {
			System.out.println("os valores sao iguais");
		}
		
		ent.close();
	}

}
