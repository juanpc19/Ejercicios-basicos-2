import java.util.Scanner;

public class ejerciciobasico5 {

	public static void main(String[] args) {
		
	
		double nota1, nota2, nota3, mediaEntera, mediaDecimal;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca notas del primer trimestre: ");
		
		nota1 = dogma.nextDouble();
		
		System.out.println("Introduzca notas del segundo trimestre: ");
		
		nota2 = dogma.nextDouble();
		
		System.out.println("Introduzca notas del tercer trimestre: ");
		
		nota3 = dogma.nextDouble();
		
		mediaEntera = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Nota media entera: " + (int)mediaEntera);
		
		mediaDecimal = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Nota media decimal: " + mediaDecimal);
		
		
		
		
	}

}
