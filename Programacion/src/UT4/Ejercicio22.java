/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * 22. Escribe un programa que calcule ab  
 * pidiendo por teclado a y b. (no puede usar la funcion pow).
 */
public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado;
        
        System.out.println("Escribe el número base:");
        int nbase = sc.nextInt();
        System.out.println("Escribe el exponente:");
        int exponente = sc.nextInt();
        
        resultado = nbase;
        
        for(int i = 1; i < exponente; i ++)
        {
            resultado = nbase * resultado;
        }
            System.out.println("El resultado es: " + resultado);
        sc.close();

	}

}
