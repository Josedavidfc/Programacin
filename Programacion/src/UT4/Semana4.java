/**
 * 
 */
package UT4;
import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * SEMANA 4
 * Se pide un programa que pida:
	1.	El peso que es capaz de soportar la tela de araña.
	2.	El peso de cada uno de los elefantes, el 1, el 2, … hasta que se introduzca un 0 
	y ya no pedirá más datos de elefantes, o bien la tela de araña se rompa por el peso.
 */
public class Semana4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teladearaña, elefante, aux, suma=0, sumatotal=0, salir = 0;
		
		while (true){
		System.out.println("¿Que peso soporta la tela de araña?");
		teladearaña = sc.nextInt(); 
		
			do {
				System.out.println("¿Cuanto pesa el elefante?");
				elefante = sc.nextInt();
				aux = elefante;
				suma = aux + sumatotal;
				sumatotal = suma;
				System.out.println(+sumatotal);
			} while (elefante !=0);
			if (teladearaña >= sumatotal) {
				System.out.println("La tela de araña aun aguanta");
			} else {
				System.out.println("La tela de araña se ha roto");
			}
			while (salir ==0 || teladearaña<=elefante);
		}
	}

}
