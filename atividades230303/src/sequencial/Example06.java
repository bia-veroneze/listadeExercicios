package sequencial;

import java.util.Scanner;

/*
 O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma
pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo
quadrado de sua altura, em que a massa está em quilogramas e a altura em metros, ou seja:
IMC = (massa/altura²)
Faça um algoritmo que leia a massa e altura da pessoa e calcule o IMC dela.
 */

public class Example06 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("digite sua massa corporal: ");
		double massa = ent.nextDouble();
		
		System.out.println("digite sua altura: ");
		double altura = ent.nextDouble();
		
		double IMC = massa/(altura*altura);
		System.out.println("o seu IMC é de: " + IMC);
		
		ent.close();
				
	}
}
