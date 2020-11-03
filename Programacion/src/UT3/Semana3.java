package UT3;
import java.util.Scanner;
//@author Jose David
/* Semana3 */


public class Semana3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int superficie=1, campos;
		float div;
		int salir=0;
		
		while (superficie!=0) {
		
			System.out.println("Introduce los m2 de tu superficie: ");
			superficie = sc.nextInt();

			System.out.println("¿Cuantos campos de futbol? ");
			campos = sc.nextInt();
			
			div=superficie/campos;
			
			if (div==5000) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}	
		
			System.out.println("");
			
			System.out.println("Si deseas salir pulse 0 de lo contario pulse 1");
			salir = sc.nextInt();
			while(salir==0);
			System.out.println("");
			
		}
		
		
	}

}
