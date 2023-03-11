package condicional;

import java.util.Scanner;

/*
 Elabore um programa que leia dois números inteiros e mostre o resultado da diferença do maior valor
pelo menor
 */

public class Example03 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		int valor1 = ent.nextInt();
		
		System.out.println("digite o segundo numero: ");
		int valor2 = ent.nextInt();
		
		System.out.println();
		
		if(valor1>valor2){
			System.out.println("o maior numero é: "+ valor1);
			int diferenca = valor1-valor2;
			System.out.println("a diferença é de: " + diferenca);	
		}else if (valor2>valor1) {
			System.out.println("o maior numero é: "+ valor2);
			int diferenca = valor2-valor1;
			System.out.println("a diferença é de: " + diferenca);	
		}else {
			System.out.println("os valores sao iguais");
		}	
		
		ent.close();
		
	}

	static void função() {
		// isso é uma função que não retorna nada
	}
	
}
