package UT3;
import java.util.Scanner;
	//@author Jose David
	/* Ejemplo pedir datos por pantalla */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Para pedir datos al usuario necesito una variable de tipo Scanner.
		// En este caso la llamo "sc" pero podria llamarse de cualquier modo.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor introduce un numero");
		
		//Guardo en la variable numero lo que el usuario introduce por teclado.
		int numero = entrada.nextInt();
		
		
		System.out.print("El numero introducido es: ");
		System.out.println(numero);
		

	}

}
