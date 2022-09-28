import java.util.Scanner;

public class ejerciciobasico3 {

	public static void main(String[] args) {

		int numero, resto;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.print("Introduzca el numero: ");
		
		numero = dogma.nextInt();
		
		resto = numero % 2;
		 
		System.out.print(resto == 0);

	}

}
