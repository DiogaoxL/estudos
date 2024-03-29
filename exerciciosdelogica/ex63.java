package exerciciosdelogica;

import java.util.*;

public class ex63 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nuemero: ");
		int numeros = sc.nextInt();
		
		String resp ;
		int soma = 0;
		int numeroMaior = Integer.MIN_VALUE;
		int c = 1;
		int numerosPares = 0;
		
		
		do {
			
			soma += numeros;
			
			if(numeros > numeroMaior) {
				numeroMaior = numeros;
			}
			
			if(numeros % 2 == 0) {
				numerosPares++;
			}
			
			System.out.println("Deseja continuar? [s/n] ");
			resp = sc.next();
			
			if(resp.equals("s")) {
				System.out.println("Digite mais um numero: ");
				numeros = sc.nextInt();	
				
				c++;
			}

		} while (resp.equals("s"));
		
		System.out.println("---------------------");
		System.out.println("O programa terminou");
		System.out.println("---------------------");
		
		System.out.println("A soma dos numeros digitados é: " + soma);
		System.out.println("O maior numero é: " + numeroMaior);
		System.out.println("Foram digitados: " + c + " numeros");
		System.out.println("A média dos valores digitados: " + (soma / c));
		System.out.println("Foram digitados: " + numerosPares + " numeros pares");
		
		
		sc.close();
	}
}
