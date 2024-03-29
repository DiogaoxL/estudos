package exerciciosdelogica;
import java.util.Scanner;

public class Ex23 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual seu nome? ");
		String nome = sc.nextLine();
		
		System.out.print("Qual seu sexo [m/f]? ");
		char sexo = sc.next().charAt(0);
		
		System.out.print("Qual o total das compras? ");
		double totalCompras = sc.nextDouble(); 
		
		if (sexo == 'm' || sexo == 'M') {
			double desconto = totalCompras - ((totalCompras * 5) / 100);
			System.out.print(nome + " suas compras com 5% de desconto " + desconto);
		} else {
			if(sexo == 'f' || sexo == 'F') {
				double desconto = totalCompras - ((totalCompras * 15) / 100);
				System.out.print(nome + "compras com 15% de desconto ficou: R$" + desconto);
			}else {
				System.out.print("Digite seu sexo corretamente [m - masculino] ou [f- feminino] ");
			}
			
		}
		

		sc.close();
		

	}
}
