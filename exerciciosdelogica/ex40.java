package exerciciosdelogica;

public class ex40 {
	public static void main(String [] args) {
		
		int c = 0;
		
		while(c <= 18) {
			if(c % 3 == 0) {
				System.out.println(c);
			}
			c++;
		}
		System.out.println("Acabou!");
	}
}
