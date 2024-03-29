package exerciciosdelogica;
import java.util.*;
public class ex29 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.print("Qual seu salario atual? ");
		double salarioAtual = sc.nextDouble();
		
		System.out.print("Qual seu tempo de empresa? ");
		int tempoDeEmpresa = sc.nextInt();
		
		double novoSalario = 0;
		
		if(tempoDeEmpresa <= 3) {
			novoSalario = salarioAtual + ((salarioAtual * 3)/100);
			System.out.print(nome + ", seu novo salario com " + tempoDeEmpresa + " anos é " + novoSalario);
		} else if(tempoDeEmpresa > 3 && tempoDeEmpresa < 10) {
			novoSalario = salarioAtual + ((salarioAtual * 12.5)/100);
			System.out.print(nome + ", seu novo salario com " + tempoDeEmpresa + " anos é " + novoSalario);
		} else {
			novoSalario = salarioAtual + ((salarioAtual * 20)/100);
			System.out.print(nome + ", seu novo salario com " + tempoDeEmpresa + " anos é " + novoSalario);
		}
		
		sc.close();
	}
}
