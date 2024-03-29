package exerciciosdelogica;
import java.util.*;

public class ex34 {
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("qual seu peso? ");
		double peso = sc.nextDouble();
		
		System.out.print("qual sua altura? ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu imc é: %.2f \n" , imc);
		
		if(imc <= 18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc > 18.5 && imc <= 25) {
			System.out.println("Peso ideal");
		}else if(imc > 25 && imc <= 30) {
			System.out.println("Sobrepeso");
		} else if(imc > 30 && imc <= 40) {
			System.out.println("Obesidade");
		}else  {
			System.out.println("Obseidade mórbida");
		}
		
		sc.close();
		
	}
}
