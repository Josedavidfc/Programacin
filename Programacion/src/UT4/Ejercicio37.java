/**
 * 
 */
package UT4;
import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 37
 * Dibujar un rectangulo con * 
 * pidiendo al usuario el numero de columnas y de filas
 */
public class Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas = 0;
		int columnas = 0;
		
		System.out.println("Escribe numero de filas: ");
		filas=sc.nextInt();
		System.out.println("Escribe numero de columnas: ");
		columnas=sc.nextInt();
		
		for(int i = 1; i <= filas; i++) {//
			for (int j = 1; j <= columnas; j++) {
				System.out.print("* ");
			}
			System.out.println("\n ");//
		}
	}

}
