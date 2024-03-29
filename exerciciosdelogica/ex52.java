package exerciciosdelogica;
import java.util.*;

public class ex52 {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		int idade;
		
		int c = 1;
		int somaIdade = 0;
		int maiorIdade = 0;
		int kid = 0;
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		while(c <= 10) {
			idade = sc.nextInt();
			
			if(idade >= 18) {
				maiorIdade++;
			}
			
			if(idade <= 5) {
				kid++;
			}
			
			if(idade > maior) {
				maior = idade;
			}
			if(idade < menor) {
				menor = idade;
			}
			
			
			somaIdade += idade;
			c++;
		}
		
		System.out.println("A media das idades: " + (somaIdade/10));
		System.out.println("O total de pessoas +18: " + maiorIdade);
		System.out.println("O total de pessoas com idade menor que 5: " + kid);
		System.out.println("A maior idade é: " + maior);
        System.out.println("A menor idade é: " + menor);
        
        sc.close();
	}
}
