package javaIntroduction;
//Faça um algoritmo que leia o nome e o salário de um empregado e exiba a informação na tela
import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = ent.nextLine();
		
		System.out.println("Digite seu salario: ");
		double salario = ent.nextDouble();
		
		System.out.println();
		
		System.out.println("O funcionario " + nome + " recebe " + salario + " de salario");
		
		ent.close();
	}

}
