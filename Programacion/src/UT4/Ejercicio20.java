/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 20
 */
public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int suma_de_numeros;
		int aux;
		int total_suma = 0;
		int media;
		int contador = -1;
		System.out.println("Escribe un numero hasta llegar a 0");
		
		do {
			contador = contador +1;
			
			System.out.println("Introduzca un numero");
			numero = sc.nextInt();
			aux = numero; //Contador para sumar los numeros que muestro por pantalla
			suma_de_numeros = aux + total_suma; 
			total_suma = suma_de_numeros;
			
		} while (numero !=0); //Hasta que no sea 0 sigue con el bucle
			System.out.println("Esta es la suma de los numeros: " + suma_de_numeros);

			media = suma_de_numeros / contador;
			System.out.println("Esta es la media: " +media);
			
			sc.close();
		
	}

}
