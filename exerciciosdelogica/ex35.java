package exerciciosdelogica;
import java.util.*;
public class ex35 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual categoria de carro você pegou?");
		System.out.println("[1] popular");
		System.out.println("[2] popular");
		System.out.print("escolha a opção: \n");
		int categoria = sc.nextInt();
		
		if(categoria < 1 || categoria > 2) {
			System.out.println("Essa opção não existe,tente novamente e escolha uma dessas");
			System.out.println("[1] popular");
			System.out.println("[2] popular");
			System.exit(1);
		}
		
		System.out.println("por quantos dias? ");
		int diasAlugados = sc.nextInt();
		
		System.out.println("qual o total de km rodado? ");
		int kmRodado = sc.nextInt();
		
		double diariaCarroPopular = 90.00;
		double diariaCarroDeLuxo = 150.00;
		
		double valorTotal = 0;
		
		
		
		if(categoria == 1) {
			if (kmRodado <= 100) {
				valorTotal = (kmRodado * 0.2) + (diariaCarroPopular * diasAlugados);
			} else {
				valorTotal = (kmRodado * 0.1) + (diariaCarroPopular * diasAlugados);
			}
		}
		
		if(categoria == 2) {
			if (kmRodado <= 100) {
				valorTotal = (kmRodado * 0.3) + (diariaCarroDeLuxo * diasAlugados);
			} else {
				valorTotal = (kmRodado * 0.25) + (diariaCarroDeLuxo * diasAlugados);
			}
		}
		
		System.out.println("O valor total a ser pago é: " + valorTotal);
		
		sc.close();
	}
}
