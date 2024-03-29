package exerciciosdelogica;
import java.util.*;

public class Ex16 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos cigarros você fuma por dia? ");
		int dailyCigarette = sc.nextInt();
		
		System.out.print("Quantos anos você fuma? ");
		int yearsSmoking = sc.nextInt();
		
		int daysSmoking = yearsSmoking * 365;
		
		int totalCigarette = daysSmoking * dailyCigarette;
		
		int minutesLost = totalCigarette * 10;
		
		double daysLost = minutesLost / 1440;
		
		System.out.printf("Você perdeu aproximadamente %.2f dias de vida devido ao cigarro.", daysLost);
		
		
		sc.close();
	}
}
