package exerciciosdelogica;

public class ex30 {
	public static void main(String [] args) {
		
		int a = 5;
		int b = 5;
		int c = 5;
		
		if( (b + c > a) || (a + c > b) || (a + b > c))  {
			System.out.print("triangulo");
			if(a == b && b == c) {
				System.out.println("O triângulo é Equilátero: todos os lados iguais.");
			} else if( a==b || a == c || b == c ) {
				System.out.println("O triângulo é Isósceles: dois lados iguais.");
			}else {
				System.out.println("O triângulo é Escaleno: todos os lados diferentes.");
			}
		}else {
			System.out.print("não é um triangulo");
		}
	}
}
