package UT3;
import java.util.Scanner;
/* Ejercicio 13. 
 * Pedir una nota de 0 a 10 y mostrarla de la forma: 
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nota;
		        
		System.out.println("Escribe la nota:");
		nota= sc.nextInt();
		        
		if(nota>0 && nota<11) {
			if(nota>=0 && nota<5) {
				System.out.println("Insuficiente");
		        }else {
		        	if(nota==5) {
		        		System.out.println("Suficiente");
		        	}else {
		        		if(nota==6) {
		        			System.out.println("bien");
		        		}else {
		        			if(nota<9) {
		        				System.out.println("notable");
		        			}else {
		        				System.out.println("sobresaliente");
		                        }
		                    }
		                }
		            }
		        }else {
		        	System.out.println("ERROR");
		        }
		 
		    }	

	}



