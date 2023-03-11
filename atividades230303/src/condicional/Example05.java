package condicional;

import java.util.Scanner;

/*
 Sejam S e H respectivamente o sexo e a altura de uma pessoa e assuma que o peso médio ideal de um
indivíduo seja dado pelas seguintes fórmulas:
a. Homens: (72.7 * H) – 58
b. Mulheres: (62.1 * H) – 44.7
 */

public class Example05 {
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		System.out.println("1 - Mulheres");
		System.out.println("2 - Homens");
		System.out.println("Digite a opcao desejada: ");
		int opcao = ent.nextInt();
		
		if(opcao ==  1) {
			System.out.println("Digite sua altura: ");
			double altura = ent.nextDouble();
			double IMC = (62.1 * altura) - 44.7;
			System.out.println("O IMC corresponde a:  " + IMC);
		} else if (opcao == 2) {
			System.out.println("Digite sua altura: ");
			double altura = ent.nextDouble();
			double IMC = (72.7 * altura)-58;
			System.out.println("O IMC corresponde a  " + IMC);
		}
		
		ent.close();
	}

}
