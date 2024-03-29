package exerciciosdelogica;

import java.util.Scanner;

public class Ex10 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a altura da parede: ");
		double altura = sc.nextDouble();
		System.out.print("Qual a largura da parede: ");
		double largura = sc.nextDouble();
		
		double area = altura * largura;
		
		double tinta = area / 2;
		
		System.out.println("a area é igual: " + area);
		System.out.println("E são necessários "+ tinta + " Lts de tinta.");
		
	}
}
