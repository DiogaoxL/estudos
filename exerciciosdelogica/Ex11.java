package exerciciosdelogica;

import java.util.Scanner;

public class Ex11 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double C = sc.nextDouble();
		
		double delta = (B*B) - (4 * A * C);
		double x1,x2;
		
		if(delta > 0) {
			x1 = (-B + Math.sqrt(delta)) / (2 * A) ;
			
			x2 = (-B - Math.sqrt(delta)) / (2 * A) ;	

			System.out.println(" o valor de delta é: " + delta );
			System.out.println(" o valor de x1 é: " + x1);
			System.out.println(" o valor de x2 é: " + x2);
			
		} else if(delta == 0) {
			x1 = (-B + Math.sqrt(delta)) / (2 * A) ;
			
			System.out.println(" o valor de delta é: " + delta + " a função possui apenas uma raiz real" );
			System.out.println(" o valor de x1 é: " + x1);
		} else {
			System.out.println("a equação não possui raízes reais");
		}
		
		
		
		sc.close();
	}
}
