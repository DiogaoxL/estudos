package exerciciosdelogica;
import java.util.Scanner;

public class Ex03 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("Qual seu salario? ");
		double salario = sc.nextDouble();
		
		System.out.println("O funcionário "+ nome + " tem um salário de "+ salario + " em Junho.");
		
		sc.close();
	}
}
