package exerciciosdelogica;

import java.util.*;

public class ex54 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadePessoas = 7;
		double peso;
		double altura;
		double somaAltura = 0;

		int c = 1;
		int pessoasMais90Kg = 0;
		int pessoasMenos50KgMenos160m = 0;
		int pessoasMais190mMais100Kg = 0;

		while (c <= quantidadePessoas) {

			System.out.println("Informe o peso da pessoa " + (c + 1) + " em kg:");
			 peso = sc.nextDouble();
			System.out.println("Informe a altura da pessoa " + (c + 1) + " em cm:");
			 altura = sc.nextDouble();
			
			if (peso >= 90) {
				pessoasMais90Kg++;
			}

			if (peso <= 50 && altura < 160) {
				pessoasMenos50KgMenos160m++;
			}

			if (altura > 190 && peso > 100) {
				pessoasMais190mMais100Kg++;
			}

			somaAltura += altura;

			c++;
		}

		double mediaAltura = (somaAltura / 3) / 100;

		System.out.printf("A média foi: %.2f\n", mediaAltura);
		System.out.println("Quantidade de pessoas que pesam mais de 90Kg: " + pessoasMais90Kg);
		System.out.println(
				"Quantidade de pessoas que pesam menos de 50Kg e têm menos de 1.60m: " + pessoasMenos50KgMenos160m);
		System.out.println(
				"Quantidade de pessoas que medem mais de 1.90m e pesam mais de 100Kg: " + pessoasMais190mMais100Kg);

		sc.close();
	}
}
