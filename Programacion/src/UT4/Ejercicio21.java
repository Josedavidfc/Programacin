/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 21
 * 21. Repetir el ejercicio anterior, 
 * pero mostrar al finalizar el mayor y el menor de los números introducidos 
 * (sin contar el 0)
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int cuenta=0; //Es una caja AUX, sirve para ir guardando datos de los numeros introducidos
		int contador=0; 
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		
		do {
			System.out.println("Introduzca un numero");
			numero = sc.nextInt();
			if (numero !=0) {
				cuenta+= numero;
				contador++;
			
				if (numero>mayor) {
					mayor=numero; }
				
				if (numero<menor) {
					menor=numero;}
			}	
			
		}
		while (numero !=0); //Hasta que no sea 0 sigue con el bucle
			//System.out.println("La suma de tus numeros:  " +contador);
			//System.out.println("La media de tus numeros: " +(cuenta/contador) );
			System.out.println("El numero mayor " +mayor);
			System.out.println("El numero menor " +menor);

			sc.close();
			
	}

}
