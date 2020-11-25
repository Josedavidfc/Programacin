/**
 * 
 */
package UT5;
import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 65
 * Leer por teclado una serie de 10 numeros enteros.
 * La aplicacion debe indicarnos si los numeros están ordenados
 * de forma creciente, decreciente o si estan desordenados.
 */
public class Ejercicio65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int enteros [] = new int [10];
		
		
		//Bucle para recorrer array y completarlo con valores introducidos por el usuario
		for (int i=0; i<enteros.length; i++) {
			System.out.println("Introduce el numero de la posicion "+i);
			enteros[i]=sc.nextInt();
		}
		
		
		if (enteros[0]>enteros[1]) {
			
			System.out.println("Creciente");
		} else {
			System.out.println("Decreciente");
			} 
		
		
		
		
		
	}

}
