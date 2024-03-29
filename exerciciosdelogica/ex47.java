package exerciciosdelogica;

public class ex47 {
	public static void main(String [] args) {
		
		int c = 500;
		int soma = 0;
		
		while(c > 0) {
			soma += c;
			
			c -= 50;
		}
		
		System.out.println("a soma: " + soma);
	}
}
