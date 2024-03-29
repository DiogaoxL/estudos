package exerciciosdelogica;

public class ex28 {
	public static void main(String [] args ) {
		
		int largura = 50;
		int comprimento = 2;
		
		int area = largura * comprimento ;
		
		if(area <= 100) {
			System.out.println(" TERRENO POPULAR ");
		} else if(area > 100 && area < 500) {
			System.out.println(" TERRENO MASTER ");
		} else if(area > 500) {
			System.out.println("TERRENO VIP");
		}
		
		
	}
}
