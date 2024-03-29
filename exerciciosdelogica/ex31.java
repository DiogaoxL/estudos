package exerciciosdelogica;

import java.util.*;

public class ex31 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		String[] opcoes = { "0 - pedra ", " 1 - papel ", " 2 - tesoura" };

		System.out.println("Jogo Pedra, Papel e Tesoura");
		System.out.println("-----------------------------");
		System.out.println("[0] - pedra");
		System.out.println("[1] - papel");
		System.out.println("[2] - tesoura");
		System.out.println("-----------------------------");

		System.out.print("qual sua escolha? ");
		int escolhaJogador = sc.nextInt();

		if (escolhaJogador < 0 || escolhaJogador > 2) {
			System.out.println("Opção invalida, tente novamente");
			System.exit(1);
		}

		int escolhaComputador = random.nextInt(3);

		System.out.println("Você escolheu " + opcoes[escolhaJogador]);
		System.out.println("O computador escolheu " + opcoes[escolhaComputador]);

		if (escolhaJogador == escolhaComputador) {
			System.out.println("Empate");
		} else if ((escolhaJogador == 0 && escolhaComputador == 2) || (escolhaJogador == 1 && escolhaComputador == 0) ||(escolhaJogador == 2 && escolhaComputador == 1) ) {
			System.out.println("Jogador ganhou!");
		}else{
			System.out.println("Computador ganhou!");
		}
		
		sc.close();

	}
}
