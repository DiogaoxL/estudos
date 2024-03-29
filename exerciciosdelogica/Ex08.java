package exerciciosdelogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma distância em metros: ");
		double m = sc.nextDouble();
		double km, hm, dam, dm,cm,mm ;
		
		km = m /1000;
		hm = m / 100;
		dam = m / 10;
		dm = m * 10;
		cm = m * 100;
		mm = m * 1000;
		
		System.out.print("A distância de " + m + "m corresponde a: \n");
		
		System.out.println(km + " km");
		System.out.println(hm + " hm");
		System.out.println(dam + " dam");
		System.out.println(dm + " dm");
		System.out.println(cm + " cm");
		System.out.println(mm + " mm");
		
		sc.close();
	}
}

