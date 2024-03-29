package exerciciosdelogica;
import java.util.*;

public class ex51 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double valorProduto;
		
		int c = 1;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		
		while(c <= 8) {
			System.out.println("Digite o valor do produto "+ c +":");
			 valorProduto = sc.nextDouble();
			 
			 if(valorProduto > maior) {
				 maior = valorProduto;
			 }else if (valorProduto < menor) {
				 menor = valorProduto;
			 }
			 c++;
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
		
		sc.close();
	}
}
