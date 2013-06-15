package trabalhoJogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int escolha = 0;
		
		do{
			Scanner reader = new Scanner(System.in);
			System.out.println("<Jogo>");
			System.out.println("\n");
			System.out.println("Escolha uma opção: ");
			System.out.println("\n1 - Iniciar Jogo \n10 - Sair");
			escolha = reader.nextInt();
			
			if(escolha == 1){
				Luta luta = new Luta();
				luta.definirQuantidadeDePersonagens();
				int quantidadeDePersonagens = reader.nextInt();
				luta.setQuantidadeDePersonagensEscolhidos(quantidadeDePersonagens);
				luta.escolherPersonagem();
			}
		}while(escolha == 10);
		
		
	}

}
