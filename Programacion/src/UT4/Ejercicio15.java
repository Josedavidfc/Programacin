package UT4;
import java.util.Scanner;
/* @author Jose David
 * Ejercicio 15. 
 * Pedir un número al usuario y mostrar su tabla de multiplicar (usar un bucle). */

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un numero: ");
        
        int contador = 1; // contador inicializado a 1
        //Guardo en la variable numero lo que el usuario introduzca por teclado.
        int numero1 = sc.nextInt();
    
        //Con bucle while
        while(contador <=10) {
            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
            contador++;
        }
        
        //Con bucle do-while
        contador = 1;
        do{
            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
            contador++;            
        }while(contador <= 10);
        
        //Con bucle for
        for(contador = 1; contador<=10; contador++) {
            System.out.printf("%d X %d = %d \n", numero1, contador, numero1*contador);
        }
	}
}
