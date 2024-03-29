package exerciciosdelogica;

public class ex46 {
	public static void main(String [] args) {
		
		int c = 6;
		int soma = 0;
		
		while(c <= 100) {
			if(c % 2 == 0) {
				soma += c;
				System.out.println(soma);
			}
			c++;
		}
	}
}
