package exerciciosdelogica;

import java.util.*;

public class ex45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro Valor: ");
		int inicio = sc.nextInt();

		System.out.println("Digite o último Valor: ");
		int fim = sc.nextInt();

		System.out.println("Digite o incremento: ");
		int incremento = sc.nextInt();
		
		int temp = 0;
		
		if(inicio > fim) {
			temp = inicio;
			inicio = fim;
			fim = temp;
		}else {
			while (inicio <= fim) {
				System.out.println(inicio);

				inicio += incremento;
			}
		}
		
		System.out.println("Acabou!!");

		sc.close();
	}
}
