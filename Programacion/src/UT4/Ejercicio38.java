/**
 * 
 */
package UT4;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 38
 * Dibuja un cuadrado con * pidiendole al usuario el numero de * por lados
 * pero solo pintando los * pares en las lineas pares
 * y las impares en las impares.
 * Ej:
 * lado = 3
 * linea 1 = *		*
 * linea 2 =	*
 * linea 3 = *		*
 * 
 * Otro Ej
 * lado 4 = 4
 * linea 1 = *		*
 * linea 2 =	*		*
 * linea 3 = *		*
 * linea 4 = 	*		*
 */
public class Ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado = 0;
		
		System.out.println("Escribe el lado del cuadrado: ");
		lado=sc.nextInt();;
		
		for(int i = 1; i <= lado; i++) {//filas
			for (int j = 1; j <= lado; j++) {//columnas
			
				if (i%2 ==0) {					//Si mi fila es par
					if (j%2==0) 				//Y mi columna es par
						System.out.print("* ");	//pintamos *
					 else 
						System.out.print(" ");	//Si no NO pintamos nada
					
				} else {						//si mi fila es impar
					if (j%2==0) 				//Y mi columna es par
						System.out.print(" ");	//NO pintamos nada
					else {
						System.out.print("* ");	//Si no pintamos un *
					}
				}
			}
			
			System.out.print("\n");
		}
	}

}
