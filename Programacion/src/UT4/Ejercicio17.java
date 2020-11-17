/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 *Ejercicio 17
 */
public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aux;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero inicial");
		int start = entrada.nextInt();
		System.out.println("Escribe un numero final");
		int stop = entrada.nextInt();
		System.out.println("Escribe un intervalo");
		int intervalo = entrada.nextInt();
		
		if(stop<start) {
			aux = stop;
			stop = start;
			start = aux;
		}
		for (int i = start; i <= stop; i =i + intervalo) {
			System.out.print(i + " ");
		}
		
	}

}
