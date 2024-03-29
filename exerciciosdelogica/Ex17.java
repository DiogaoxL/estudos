package exerciciosdelogica;
import java.util.*;
public class Ex17 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade do carro? ");
		
		int velocidade = sc.nextInt();
		double multa = 0;
		
		if(velocidade > 80) {
			multa =  (velocidade - 80) * 5;
			
			System.out.print("Você foi multado pois estava "+ velocidade + " km/h no valor de R$" + multa);
		}else {
			System.out.println("Você esta andando na lei");
		}
		
		sc.close();
	}
}
