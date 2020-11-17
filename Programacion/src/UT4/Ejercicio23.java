/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * 23. Escribe un programa que pida un número y 
 * luego muestre en pantalla todos los números pares 
 * que hay entre 0 y el número solicitado.
 */
public class Ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		
		for (int i = 0; i <= numero; i++) {    
			if (i%2==0) {
				System.out.println(i);
            }    
        }
	}

}
