package exerciciosdelogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do primeiro bimestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do segundo bimestre: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média entre "+nota1 + " e "+ nota2 + " é igual a " + media);
		
		sc.close();
	}
}
