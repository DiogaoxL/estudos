package exerciciosdelogica;
import java.util.*;

public class ex33 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual o valor da casa? ");
		double valorCasa = sc.nextDouble();
		
		System.out.print("qual o seu salário atualmente? ");
		double salarioAtual = sc.nextDouble();
		
		System.out.print("quantos anos deseja financiar? ");
		int tempoEmAnos = sc.nextInt();
		
		int tempoEmMeses = tempoEmAnos * 12;
		
		double valorPrestacaoMensal = valorCasa / tempoEmMeses;
		
		double porcentagemDoSalario = (valorPrestacaoMensal / salarioAtual) * 100;
		
		System.out.println("tempo de financiamento: " + tempoEmMeses + " meses ");
		System.out.printf("valor das prestações: R$%.2f por mês \n" , valorPrestacaoMensal);
		System.out.printf("esse valor equivale a %.2f%% do seu salario \n", porcentagemDoSalario);
		
		if(porcentagemDoSalario <= 30.0) {
			System.out.println("EMPRESTIMO PRÉ-ACEITO");
		}else {
			System.out.println("EMPRESTIMO NEGADO pois excederá o valor minimo de 30%");
		}
		
		sc.close();
	}
}
