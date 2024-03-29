package exerciciosdelogica;
import java.util.Scanner;
public class Ex13 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu salario? ");
		double wage = sc.nextDouble();
		
		double newWage = wage + ((wage * 15 ) / 100) ;
		
		System.out.println("seu novo salrio é : " + newWage);
		
		sc.close();
	}
}
