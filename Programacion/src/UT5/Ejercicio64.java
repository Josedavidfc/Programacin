/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 64:
 * Leer por teclado dos tablas de 5 numeros enteros y mezclarlas en una tercera de la forma:
 * el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc
 * 2
 * 4
 * 6
 * 1
 * 80
 */
public class Ejercicio64 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int [10];
        int i,j;
 
        
        // leemos la tabla a
        System.out.println("Leyendo la tabla a");
        for (i=0;i<5;i++){
            System.out.print("número: ");
            a[i]=sc.nextInt();
        }
        
        // leemos la tabla b
        System.out.println("Leyendo la tabla b");
        for (i=0;i<5;i++){
            System.out.print("número: ");
            b[i]=sc.nextInt();
        }
        
        j=0;
        for (i=0;i<5;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("La tabla c queda: ");
        for (j=0;j<10;j++)
            System.out.print(c[j]+" ");
            System.out.println("");
            
	}
}

