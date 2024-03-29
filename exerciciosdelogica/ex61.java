package exerciciosdelogica;

public class ex61 {
	
	public static void main(String [] args) {
		
		int c = 0;
		
		do {
			
			if(c % 3 == 0) {
				System.out.println(c);
			}
			c++;
			
		}while(c <= 30);
	}
}
