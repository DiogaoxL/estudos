package exerciciosdelogica;
import java.util.*;

public class ex53 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int sexo;
		int c = 1;
		
		int quantHomem= 0;
		int quantMulher=0;
		
		int somaIdade = 0;
		int mediaHomens = 0;
		int mulherMaisVinte = 0;
		
		while(c <= 5) {
			System.out.print("Qual sua idade? ");
			idade = sc.nextInt();
			
			System.out.println("Qual seu sexo? Digite [1- homem] ou [2- mulher]");
			sexo = sc.nextInt();
			
			if(sexo != 1 && sexo != 2) {
				System.out.println("Tente novamente e digite  [1- homem] ou [2- mulher]");
				System.exit(1);
			}
			
			if(sexo == 1) {
				quantHomem++;
				mediaHomens += idade;
			}
			
			if(sexo == 2) {
				quantMulher++;
				
				if(idade >= 20) {
					mulherMaisVinte++;
				}
			}
			
			somaIdade += idade;
			c++;
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("Foram cadastrados " + quantHomem + " homens");
		System.out.println("Foram cadastradas " + quantMulher + " mulheres");
		System.out.println("A media de idade do grupo " + (somaIdade / 5));
		System.out.println("A media de idade dos homens " + (mediaHomens / quantHomem));
		System.out.println("As mulheres com mais de 20 anos totalizaram: " + mulherMaisVinte);
		
		
		sc.close();
		
		
	}
}
