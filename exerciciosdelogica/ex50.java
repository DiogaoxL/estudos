package exerciciosdelogica;
import java.util.*;

public class ex50 {
	public static void main(String [] args){
	
		int c = 1;
				Random random = new Random();
		
		int numeroSorteado = random.nextInt(10);
	int numerosMaiorQueCinco = 0;
		int divPorTres = 0;
		
		System.out.println("os numeros sorteados foram: ");
		
		while(c <= 20) {
			numeroSorteado = random.nextInt(10);
			if(numeroSorteado > 5) {
				numerosMaiorQueCinco++;
			}
			
			if(numeroSorteado % 3 == 0) {
				divPorTres++;
			}
			
			System.out.println(numeroSorteado);
			c++;
		}
		System.out.println("---------------------------------------------------------");
		System.out.println(numerosMaiorQueCinco + " estao acima de 5");
		System.out.println(divPorTres + " são divisiveis por 3");
	}
}
