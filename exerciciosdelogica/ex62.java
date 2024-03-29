package exerciciosdelogica;
import java.util.*;

public class ex62 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade de várias pessoas: ");
		int idades = sc.nextInt();
		
		String resp;
		int c = 1;
		int somaIdades = 0;
		int idadeMaiorQue21 = 0;
		
		do {
			
			
			System.out.println("As idades digitadas foram: "+ idades);
			somaIdades += idades;
			
			if(idades >= 21) {
				idadeMaiorQue21++;
			}
			
			System.out.println("Deseja continuar ");
			resp = sc.next();
			
			
			if(resp.equals("s")) {
				System.out.println("Digite + uma idade: ");
				idades = sc.nextInt();
				c++;
			}
			
		} while (resp.equals("s"));
		
		System.out.println("---------------------------");
		System.out.println("Programa terminou");
		System.out.println("---------------------------");
		System.out.println("Foram digitadas " + c + " idades");
		System.out.println("A média das idades: " + (somaIdades/c));
		System.out.println("Pessoas que tem 21 anos ou mais: " + idadeMaiorQue21);
		
		sc.close();
		
	}
}
