package exerciciosdelogica;

public class Ex22 {
	public static void main(String [] args) {
		
		int anoNascimento = 2004;
		int anoAtual = 2024;
		
		int validacaoMilitar = anoAtual - anoNascimento ;
		
		if(validacaoMilitar < 18) {
			System.out.print("voce ainda não pode se alistar, ainda faltam " + (18 - validacaoMilitar) + " anos");
		}else {
			System.out.print("voce pode se alistar, ja passou " + (validacaoMilitar - 18) + " anos da idade minima");
		}
		
	}
}
