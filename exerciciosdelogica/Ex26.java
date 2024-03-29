package exerciciosdelogica;

import java.util.*;

public class Ex26 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("O primeiro valor é o maior");
		} else {
			if(n2 > n1) {
				System.out.println("O segundo valor é o maior");
			}else {
				System.out.println("Não existe valor maior, os dois são iguais");
			}
		}
		
		sc.close();
		
	}
}