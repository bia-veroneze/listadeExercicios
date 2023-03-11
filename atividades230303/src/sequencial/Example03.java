package sequencial;

import java.util.Scanner;

/*
 Dado um número inteiro de 4 dígitos, faça um algoritmo que inverte esse número e o
escreva na tela. Por exemplo: 3674 -> 4763. Dica: use e abuse dos operadores de resto e
divisão inteira
 */

public class Example03 {
	public static void main(String[] args) {
		int numero, invertido = 0, resto;
		 
	      Scanner ent = new Scanner( System.in );
	      System.out.println( "Ejemplo para la inversión de un número" );
	      System.out.println( "Introduce un número: " );
	 
	      numero = ent.nextInt();
	 
	      while( numero > 0 ) {
	         resto = numero % 10;
	         invertido = invertido * 10 + resto;
	         numero /= 10;
	      }
	 
	      System.out.println( "Número invertido: " + invertido );
	      
	      ent.close();
	}
	
}
