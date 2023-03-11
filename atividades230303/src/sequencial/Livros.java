package sequencial;

import java.util.Scanner;

/*  
Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode
escolher entre dois critérios para pagamento:
1. Critério A: R$ 0,25 por livro + R$ 7,50 fixo
2. Critério B: R$ 0,50 por livro + R$ 2,50 fixo
  */

public class Livros {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Escolha uma opcao: ");
		System.out.println();
		System.out.println("1.  R$ 0,25 por livro + R$ 7,50 fixo");
		System.out.println("2.  R$ 0,50 por livro + R$ 2,50 fixo");
		System.out.println();
		
		System.out.println("Digite o opcao desejada: ");
		
		int opcao = ent.nextInt();

		
		if (opcao == 1) { 
			System.out.print(" A opcao escolhida foi: R$ 0,25 por livro + R$ 7,50 fixo");
			System.out.println();
			double fixo1 = 7.50;
			double var1 = 0.25;
			
			System.out.println("Quantos livros foram escolhidos? : ");
			int selecionados = ent.nextInt();
			
			double valor = (selecionados*var1)+fixo1;
			
			System.out.println("custou: "+ valor +" reais");
			
			
		} else if (opcao == 2){
			System.out.print(" A opcao escolhida foi: R$ 0,50 por livro + R$ 2,50 fixo");
			System.out.println();
			
			double fixo2 = 2.50;
			double var2 = 0.50;
			
			System.out.println("Quantos livros foram selecionados? : ");
			int selecionados = ent.nextInt();
			
			double valor = (selecionados*var2)+fixo2;
			
			System.out.println("Custou "+ valor +" reais");
			
		}

		ent.close();
		
	}

}
