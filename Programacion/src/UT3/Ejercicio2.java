package UT3;
import java.util.Scanner;
//@author Jose David
/* Decir si un numero es par o impar  */


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para saber si es par o impar");
		int numero = sc.nextInt();
		
		if(numero%2==0) //Si numero es divisible entre 2 == 0 es par
		{
			System.out.println("Es par");
				
		} else { //Si no es impar
			System.out.println("Es Impar");
			
		}
	
	}

}
