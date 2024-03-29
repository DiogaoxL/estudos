package exerciciosdelogica;

import java.util.*;

public class ex55 {
	public static void main(String[] args) {

		Random random = new Random();

		Scanner sc = new Scanner(System.in);

		int numeroAleatorio = random.nextInt(10) + 1;

		System.out.print("Digite um numero entre 1 e 10: ");
		int escolhaJogador = sc.nextInt();

		if (escolhaJogador < 1 || escolhaJogador > 10) {
			System.out.print("So pode escolher um numero entre 1 e 10");
			System.exit(1);
		}
		
		int numTentativas = 4;
		int contadoraTentativas = 1;
		
		while(contadoraTentativas <= numTentativas) {
			if (escolhaJogador == numeroAleatorio) {
				System.out.print("Você acertou o numero");
			} else {
				System.out.print("Você errou, tente novamente");
				System.out.print("Digite um numero entre 1 e 10: ");
				escolhaJogador = sc.nextInt();
			}
			contadoraTentativas++;
		}


		sc.close();

	}
}
