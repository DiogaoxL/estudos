package exerciciosdelogica;
import java.util.*;

public class ex42 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		
		int c = 1;
		
		while(c <= n) {
			System.out.println(c);
			c++;
		}
		System.out.println("Acabou!");
		
		sc.close();
	}
}
