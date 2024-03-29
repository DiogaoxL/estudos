package exerciciosdelogica;
import java.util.Scanner;
public class Ex24 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a distancia da viagem em km? ");
		int distanciaKM = sc.nextInt();
		
		double passagem = 0;
		
		if(distanciaKM <= 200) {
			passagem = distanciaKM * 0.5;
			System.out.print("na sua viagem de " + distanciaKM + "km o total de passagem é : R$"+ passagem);
		}else {
			passagem = distanciaKM * 0.45;
			System.out.print("na sua viagem de " + distanciaKM + "km o total de passagem é : R$"+ passagem);
		}
	}
}
