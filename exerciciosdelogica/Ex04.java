package exerciciosdelogica;
import java.util.Scanner;
public class Ex04 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros para fazer a soma: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("a soma de " + n1 + " e " + n2 + " é igual a " + soma );
	}
}
