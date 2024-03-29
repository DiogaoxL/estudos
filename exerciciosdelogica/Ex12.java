package exerciciosdelogica;

import java.util.Scanner;

public class Ex12 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto: ");
		double price = sc.nextDouble();
		
		double discount =((price * 5) / 100);
		
		double  discountPrice = price - discount;
		
		System.out.println("o preço promocional do produto é: " + discountPrice);
		
		sc.close();
		
	}
}
