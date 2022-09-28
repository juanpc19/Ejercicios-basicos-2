import java.util.Scanner;

public class ejerciciobasico1 {

	public static void main(String[] args) {
		
		double kilos, kilosManzanas, kilosPeras, importeTotalM, importeTotalP, beneficioAnual;
		final double precioManzanas, precioPeras;
		
		Scanner dogma = new Scanner(System.in);
		
		precioManzanas = 2.35;
				
		precioPeras = 1.95;
		
		System.out.print("Cuantos kilos de manzanas ha vendido? ");
		
		kilosManzanas = dogma.nextDouble();
		
		System.out.print("Cuantos kilos de peras ha vendido? ");
		
		kilosPeras = dogma.nextDouble();

		beneficioAnual = kilosManzanas * precioManzanas + kilosPeras * precioPeras; 
		
		System.out.print("El beneficio anual es: " + beneficioAnual);
		
		

	}

}
