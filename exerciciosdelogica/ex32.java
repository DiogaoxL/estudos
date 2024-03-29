package exerciciosdelogica;
import java.util.*;

public class ex32 {
	public static void main(String [] args) {
		
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int numeroAleatorio = random.nextInt(5) + 1;
		
		
		System.out.print("Digite um numero entre 1 e 5: ");
		int escolhaJogador = sc.nextInt();
		
		if(escolhaJogador < 1 || escolhaJogador > 5){
			System.out.print("So pode escolher um numero entre 1 e 5");
			System.exit(1);
		}
		
		if(escolhaJogador == numeroAleatorio ) {
			System.out.print("Você acertou o numero");
		}else {
			System.out.print("Você errou, tente novamente");
		}
		
		sc.close();
		
	}
}
