package UT3;
import java.util.Scanner;
//@author Jose David
/* Ejercicio 11 */



public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float importe;
		
		System.out.println("Introduce el importe de tu compra");
		importe = sc.nextFloat();
		
		if(importe>=200) {
			System.out.println("Tu importe seria " +importe*0.8);
		} else if(importe>=100 && importe<200) {
			System.out.println("Tu importe seria " +importe*0.9);
		} else {
			System.out.println("Tu importe seria " +importe);
		}
		

	}

}
