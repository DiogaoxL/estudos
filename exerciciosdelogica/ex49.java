package exerciciosdelogica;

import java.util.Scanner;

public class ex49 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 6 números: ");
		int n; 
		int c = 1;
		
		while(c <= 6) {
			System.out.print("Digite o "+ c +"  número: ");
			n = sc.nextInt() ; 
			
			if(n % 2 == 0) {
				System.out.println( n + " é um numero par");
			}else {
				System.out.println( n + " é um numero impar");
			}
			
			c++;
		}
		
		
		
		sc.close();
	}
	
}
