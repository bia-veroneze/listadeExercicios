package sequencial;

/*
 Faça um programa que leia o valor dos catetos de um triângulo retângulo e calcule a
hipotenusa, de acordo com o Teorema de Pitágoras. Escreva uma saída adequada para o seu
algoritmo
 */

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("digite o valor do primeiro cateto: ");
		double cateto1 = ent.nextDouble();
		
		System.out.println("digite o valor do segundo cateto: ");
		double cateto2 = ent.nextDouble();
		
		double quad1 = (cateto1*cateto1);
		double quad2 = (cateto2*cateto2);
		
		double hipotenusa = quad1+quad2;
		
		double resultado = Math.sqrt(hipotenusa);
		System.out.println("O valor da Hipotenusa é: " + resultado);
		
		ent.close();
	}

}
