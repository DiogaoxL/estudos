package exerciciosdelogica;
import java.util.*;

public class Ex09 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto você tem em R$: ");
		double dinheiroEmReais = sc.nextDouble();
		
		double dolar = 3.45;
		
		System.out.printf("Sera possivel comprar %.2f dolares" , (dinheiroEmReais / dolar));
		
		sc.close();
		 
	}
}
