/**
 * 
 */
package UT4;

/**
 * @author josedavidfernandezcomino
 * Ejercicio 35:
 * Mostrar la tabla de multiplicar de los números del 1 al 10 
 * (no pedir ningún dato al usuario)
 */
public class Ejercicio35 {
	public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.print("\n");
        }

	}

}
