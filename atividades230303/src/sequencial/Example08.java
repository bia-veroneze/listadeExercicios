package sequencial;
/*
 Em épocas de crise, comerciantes estão oferecendo descontos para aumentarem suas vendas.
Faça um programa que leia o valor total da compra e um valor de desconto e escreva o novo
valor, aplicado o desconto.
 */

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite o valor total da compra: ");
		double valor = ent.nextDouble();
		
		System.out.println("digite o valor do desconto: ");
		double porcentagem = ent.nextDouble();
		
		double desconto = (double) porcentagem / 100;
		desconto = desconto * valor;
		
		double valorFinal = valor - desconto;
		
		System.out.println("O valor final é: "+ valorFinal);
		
		
		
		ent.close();
	}

}
