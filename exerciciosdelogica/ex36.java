package exerciciosdelogica;
import java.util.*;

public class ex36 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantas horas de atividade fisica no mês: ");
		int horasDeAtividade = sc.nextInt();
		
		double recompensa = 0;
		
		if(horasDeAtividade <= 10) {
			recompensa = horasDeAtividade * (2 * 0.5);
		} else if(horasDeAtividade > 10 && horasDeAtividade <= 20) {
			recompensa = horasDeAtividade * (5 * 0.5);
		}else{
			recompensa = horasDeAtividade * (10 * 0.5);
		}
		
		System.out.print("Parabéns você ganhou: R$" + recompensa);
		
		sc.close();
	}
}
