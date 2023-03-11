package sequencial;

import java.util.Scanner;

//Faça um programa que leia do teclado uma quantidade de segundos e transforme este tempo em dias, horas e minutos
public class Example02 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite os segundos para converter: ");
		int seconds = ent.nextInt();
		
		/*
		dias
		horas
		minutos 
	
		codigo do google:
	
		int segundos = 5082;


		int hor = (int)(segundos / (60 * 60));

		int min = (int)((segundos - (hor * 60 * 60)) / 60);

		int seg = (int)(segundos - (hor * 60 * 60) - (min * 60));

		
		*/
		
		System.out.println();

		System.out.println();
		
		
		ent.close();
		
	}

}
