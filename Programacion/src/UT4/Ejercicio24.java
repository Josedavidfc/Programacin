/**
 * 
 */
package UT4;
import java.util.Scanner;
/**
 * @author josedavidfernandezcomino
 * 24. Pedir números al usuario hasta que introduzca un 0. 
 * Sumar en un acumulador solo aquellos que sean pares.
 */
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero=0,suma=0, contadordenumeros=0;
        
        do {
        	contadordenumeros++;
        	System.out.println("Introduce números");
        	numero = sc.nextInt();
            //suma me va sumando todo desde dentro, hasta que yo le diga con una orden, que me lo pinte por pantalla
        	if (numero %2==0) {
        		suma += numero;
        		}
        }
        while(numero!=0);
        System.out.println("FIN");
        System.out.println("La suma de los números pares es "+suma);
        
	}
}
