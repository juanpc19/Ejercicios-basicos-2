import java.util.Scanner;

public class ejerciciobasico4 {

	public static void main(String[] args) {
		
	boolean respuesta1, respuesta2, respuesta3, calle;
	
	Scanner dogma = new Scanner(System.in);
	
	System.out.print("Tienes que ir a la biblioteca? ");
	
	respuesta1 = dogma.nextBoolean();
	
	System.out.print("Esta lloviendo? ");
	
	respuesta2 = dogma.nextBoolean();
	
	System.out.print("Ha acabado sus tareas? ");
	
	respuesta3 = dogma.nextBoolean();
	
	calle = respuesta1 || !respuesta2 && respuesta3;
	
	System.out.print(calle);
	
	
	
	
	
	
	
	
	
	

	}

}
