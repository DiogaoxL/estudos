package exerciciosdelogica;
import java.util.*;

public class Ex07 {
	public static void main(String [] args ) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double n = sc.nextDouble();
		
		System.out.println("O dobro de " + n + " é " + (n * 2));
		
		System.out.println("A terça parte de " + n + " é " + ((n * 1) / 3));
		
		sc.close();
	}
}
