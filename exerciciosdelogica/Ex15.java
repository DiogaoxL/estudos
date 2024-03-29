package exerciciosdelogica;
import java.util.*;

public class Ex15 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dias você trabalhou? ");
		int daysWork = sc.nextInt();
		
		double valueDay = daysWork * (8 * 25);
		
		System.out.println("o seu salario esse mês: " + valueDay);
		
		sc.close();
	}
}
