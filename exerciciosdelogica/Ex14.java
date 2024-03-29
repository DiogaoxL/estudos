package exerciciosdelogica;
import java.util.*;

public class Ex14 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos km foram percorridos? ");
		double kmTraveled = sc.nextDouble();
		
		System.out.println("Quantos dias de aluguel? ");
		int daysTraveled = sc.nextInt();
		
		double priceDays = daysTraveled * 90;
		
		double priceKm = kmTraveled * 0.2;
		
		double total = priceKm + priceDays;
		
		System.out.println("Foram percorridos " + kmTraveled + " km " + "ficou R$" + priceKm);
		System.out.println("Com " + daysTraveled + " dias alugados " + "ficou R$" + priceDays);
		System.out.println("No total: R$" + total);
	}
}
