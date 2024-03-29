package exerciciosdelogica;
import java.util.Scanner;
public class Ex02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Ola " + nome + " é um prazer te conhecer");
		
		sc.close();
	}
}
