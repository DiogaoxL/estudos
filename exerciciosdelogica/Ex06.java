package exerciciosdelogica;

import java.util.Scanner;

public class Ex06 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para descobir seu antecessor e sucessor: ");
		int n = sc.nextInt();
		
		System.out.println("O antecessor de " + n + " é: " + (n - 1));
		System.out.println("O antecessor de " + n + " é: " + (n + 1));
		
		sc.close();
		
	}
}
