package exerciciosdelogica;

public class Ex27 {
	public static void main(String[] args) {

		double nota1 = 5;
		double nota2 = 0;
		
		double media = (nota1 + nota2) / 2;
		
		if(media < 4.9) {
			System.out.println("reprovado");
		}else {
			if(media > 5 && media <= 6.9) {
				System.out.println("recuperação");
			}else if(media > 7){ 
				System.out.println("aprovado");
			}
		}

	}
}
