package exerciciosdelogica;
import java.util.Scanner;

public class Ex18 {
	public static void main(String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qual ano você nasceu? ");
		int anoNascimento = sc.nextInt();
		
		int voto = 2024 - anoNascimento ;
		
		if(voto >= 18) {
			System.out.print("voce ja pode votar");
		}else {
			System.out.print("voce ainda não pode votar");
		}
		
		sc.close();
	}
}
