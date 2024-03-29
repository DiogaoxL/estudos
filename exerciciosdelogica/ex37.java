package exerciciosdelogica;
import java.util.*;

public class ex37 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual seu salario atual? ");
		double salarioAtual = sc.nextDouble();
		
		System.out.print("Qual seu sexo [1- Homem] [2- Mulher]? ");
		int sexo = sc.nextInt();
		
		if(sexo < 1 || sexo > 2) {
			System.out.print("Tente novamente digitando [1- Homem] ou [2- Mulher] ");
			System.exit(0);
		}
		
		System.out.print("Qual seu tempo de empresa? ");
		int tempoDeEmpresa = sc.nextInt();
		
		double novoSalario = 0;
		
		if(sexo == 1) {
			if(tempoDeEmpresa <= 15) {
				novoSalario = salarioAtual + ((salarioAtual * 5)/ 100);
			} else if(tempoDeEmpresa > 15 && tempoDeEmpresa <= 20) {
				novoSalario = salarioAtual + ((salarioAtual * 12)/ 100);
			}else {
				novoSalario = salarioAtual + ((salarioAtual * 23)/ 100);
			}
		}
		
		if(sexo == 2) {
			if(tempoDeEmpresa <= 20) {
				novoSalario = salarioAtual + ((salarioAtual * 3)/ 100);
			} else if(tempoDeEmpresa > 20 && tempoDeEmpresa <= 30) {
				novoSalario = salarioAtual + ((salarioAtual * 13)/ 100);
			}else {
				novoSalario = salarioAtual + ((salarioAtual * 25)/ 100);
			}
		}
		
		System.out.println("Seu novo salario é: R$" + novoSalario);
		
		sc.close();
	}
}
