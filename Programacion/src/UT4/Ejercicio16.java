/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Pedir numero inicio y numero fin, e intervalo y devolver lista de numeros.
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero inicial");
		int start = entrada.nextInt();
		System.out.println("Escribe un numero final");
		int stop = entrada.nextInt();
		System.out.println("Escribe un intervalo");
		int intervalo = entrada.nextInt();
		
		for(int i = start; i <=stop; i = i+intervalo) {
			System.out.println(i + " ");
		}
		
		
		
		entrada.close();
	}

}
