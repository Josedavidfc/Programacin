/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 *Ejercicio 19
 */
public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		int suma = 0;
		System.out.println("Escribe un numero hasta llegar a 0");
		
		while (numero !=0) { //Hasta que no sea 0 sigue con el bucle
			numero = sc.nextInt(); // NUestro numero que metemos por pantalla
			suma = suma + numero; //Contador para sumar los numeros que muestro por pantalla
		}
		System.out.println("El resultado es: " + suma);
		sc.close();
		
	}

}
