package condicional;

import java.util.Scanner;

/*
 Crie um algoritmo que leia a idade do eleitor e informe se o eleitor é facultativo (entre 16 e 17 anos)
ou obrigatório (entre 18 a 65) ou dispensado (acima de 65).
 */

public class Example06 {
	public static void main(String[] args) {
		Scanner  ent = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = ent.nextInt();
		
		if(idade < 16 && idade >= 0){
			System.out.println("Ainda não vota");	
		}else if (idade == 16 && idade == 17){
			System.out.println("Voto facultativo");	
	 	}else if (idade >= 18 && idade <= 65){
	 		System.out.println("Voto Obrigatorio");
		}else if (idade > 65) {
			System.out.println("Dispensado");
		}else {
			System.out.println("Idade Invalida");
		}
		
		
		ent.close();
	}
}
