package exerciciosdelogica;

public class ex25 {
	public static void main(String [] args) {
		
		int a = 5;
		int b = 10;
		int c = 9;
		
		if( (b + c > a) || (a + c > b) || (a + b > c))  {
			System.out.print("triangulo");
		}else {
			System.out.print("não é um triangulo");
		}
	}
}
