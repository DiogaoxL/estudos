package exerciciosdelogica;
import java.util.*;

public class ex48 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 7 números: ");
		int n; 
		int c = 1;
		int soma = 0;
		
		while(c <= 7) {
			System.out.print("Digite o "+ c +"  número: ");
			n = sc.nextInt() ; 
			
			soma += n;
			
			c++;
		}
		
		System.out.println("A soma dos numeros digitados: " + soma);
		
		sc.close();
		
	}
}
