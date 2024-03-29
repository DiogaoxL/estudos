package exerciciosdelogica;

public class ex41 {
	public static void main(String[] args) {
		int c = 100;

		while (c >= 0) {
			if (c % 5 == 0) {
				System.out.println(c);
			}
			c--;
		}
		System.out.println("Acabou!");
	}
}
