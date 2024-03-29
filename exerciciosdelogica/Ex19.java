package exerciciosdelogica;
import java.util.Scanner;

public class Ex19 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.print(nome + " qual foi sua nota 1? ");
		double nota1 = sc.nextDouble();
		
		System.out.print(nome + " qual foi sua nota 2? ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Sua media foi: " + media);
			System.out.print("Você teve um bom aproveitamento");
		} else {
			System.out.print("Você não teve um bom aproveitamento");
		}
		
		
		sc.close();
	}
}
