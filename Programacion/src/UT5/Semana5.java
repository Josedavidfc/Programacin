/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 * Semana 5
 * Se pide un programa que:
 * 1.	Pida las cartas de una mano, de una en una hasta 4 cartas como mucho. Para cada carta se pide número (del 1 al 13) 
 * y palo indicado con un carácter (P, picas, D, diamantes, T, tréboles, C, corazones).
 * 2.	Una vez tengamos la mano de 4 cartas, estudiarla y ver qué carta nos hace falta para conseguir una escalera de color.
 * Devolverá número y palo de la carta necesaria. 
 * 3.	Si no se puede conseguir escalera de color devolvemos un mensaje.
 * Una vez termina vuelve a preguntar por una nueva mano de cartas. 
 * Para salir del programa debemos escribir un 0 en esa pregunta o bien usar una opción salir independiente.

 */
public class Semana5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] carta = new int [4];
		int i;
		boolean ordenado = false;
		
		System.out.println("Introduce un numero: ");
		for (i=0; i<4; i++) {
			System.out.println("Introduce un numero" +(i+1) + ":" + " ");
			carta[i] = sc.nextInt();
		}
		
		for (i = 0; i<carta.length;i++) {
			if(i+1 < carta.length) {
				if (carta[i] > carta[i + 1]) {
					ordenado = false;
					break;
				}
			}
		}
		if (ordenado) {
			System.out.println("La lista esta ordenada");
		} else {
			System.out.println("La lista no esta ordenada");
		}

		
		
		
		

		
		
	}

}
