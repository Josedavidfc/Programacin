/**
 * 
 */
package UT4;
import java.util.Scanner;
/**
 * @author josedavidfernandezcomino
 * 26. Escribe un programa que pida un número y luego muestre en pantalla 
 * todos los números primos que hay entre 0 y el número solicitado.
 */
public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		
		for (int a = 0; a <= numero; a++) {  //primer for es el que va variando 
			contador = 0;
			
			for (int i = 1; i <= a; i++) { 
				if ((a % i) ==0) { 
					contador++;
				}
			}
			
			if (contador <= 2) {
				System.out.println(a);
			}
		}

	}
}
