package UT3;
import java.util.Scanner;
//@author Jose David
/* Ejercicio Semana2 */

public class Semana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		
	do { //PARA REPETIR LA FUNCION HASTA QUE EL NUMERO DE 0.
		System.out.println("Cual es tu estado de animo: 1=Feliz. 2=Cabreado. 3=Triste. 4=Cansado. 0=SALIR");
		numero = sc.nextInt();
		
		switch(numero) {
			case 1 : System.out.println("FRASE PARA FELIZ");
				break;
			case 2 : System.out.println("FRASE PARA CABREADO");
				break;				
			case 3 : System.out.println("FRASE PARA TRISTE");
				break;
			case 4 : System.out.println("FRASE PARA CANSADO");
				break;
			case 0 : System.out.println("HASTA LUEGO");
				break;
			default: System.out.println("ERROR!! Tiene que ser numero del 1 al 4, o cero para salir");
				break;
		}
	}while (numero !=0);

		
	
		
		// Pintamos el menu.
		//Elige una opcion:
			//1. Necesito Cafe
			//2. Paso de ir caminando
			//3. A tope con el isnti.
			//0. Salir
		//Leo la opcion elegida y guardamos en variables opcion.
		//Segun la opcion elegida devulvo frase.
			// CASO 1: 
			// CASO 2:
			// CASO 3:
			// CASO 4:
		//Leo la opcion elegida y la guardo en variable. //Para leer necesito un scanner.
		//Segun la opcion elegida, devuelvo frases.
		// CASO 1: PINTO FRASE PARA FELIZ
		// CASO 2: PINTO FRASE PARA CANSADO
		// CASO 3: PINTO FRASE PARA TRISTE
		// CASO 4: PINTO FRASE PARA CABREADO
		// VUELVO A PINTAR EL MENU SI LA OPCION NO ES 0
		
		
	}

}
