/**
 * 
 */
package UT5;

import java.util.Scanner;

/**
 * @author josedavidfernandezcomino
 *...
 */
public class Proyecto3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [][] espacio; // el array interpreta al mapa
		int filas, columnas, filaactual, filaini, filafin, columnaactual, columnaini, columnafin;
		int mov; // numero del movimiento
		/*filas y columnas es el tamaño del array que quiero
		* filaactual y columnaactual es la posicion en la que esta la nave
		* filaini y columna ini es la casilla de salida
		* filafin y columnafin es la casilla del final
		*/
		boolean terminado = false, atrapado=false;

		System.out.println("Introduce numero de filas: ");
		filas = sc.nextInt();
		System.out.println("Introduce numero de columnas: ");
		columnas = sc.nextInt();
		espacio = new char [filas][columnas]; // creo el array con tamaño fila columna
		filaini=0; // casilla inicial
		columnaini=0;
		filafin=filas-1; // casilla final
		columnafin=columnas-1; 
		filaactual=filaini; // Lo utilizo para ir moviendome y actualizo para saber donde estoy.
		columnaactual=columnaini; // Lo utilizo para ir moviendome y actualizo para saber donde estoy


		char[] c= {'*', '.'}; // array con los caracteres para rellenar
		
		// rellenar el array
		for(int i=0;i<filas;i++){
			for(int j=0;j<columnas;j++){
			espacio[i][j]=c[(int)(Math.random()*2)]; // mirar que ees longituad
			}
		}
		espacio[filaini][columnaini]='@'; // pongo la casilla inicial
		espacio[filafin][columnafin]='@'; // pongo la casilla fin

		//pintar
		for(int i=0;i<filas;i++){
			System.out.print("        ");
			for(int j=0;j<columnas;j++){
				System.out.print(espacio[i][j]+ " ");
			}
			System.out.println("\n");    
		}

		//No entra en el while porque esta atrapado
		if(espacio[filaactual][columnaactual+1]=='*' && espacio[filaactual+1][columnaactual]=='*'&&espacio[filaactual+1][columnaactual+1]=='*') {
			atrapado=true; //Atrapado porque esta rodeado de *
			} else if(espacio[filaactual][columnaactual+1]=='*' && filaactual+1==filas) {
				atrapado=true; //Atrapado porque tiene un * a la derecha
				} else if(espacio[filaactual+1][columnaactual]=='*' && columnaactual+1==columnas) {
					atrapado=true; // Atrapado porque abajo tiene un * y a la derecha es el final del tablero.
					}
		
		while(!atrapado && !terminado) {
			System.out.println("MOVIMIENTOS:");
			System.out.println("1. Derecha");
			System.out.println("2. Abajo");
			System.out.println("3. Abajo y derecha");
			mov = sc.nextInt();
			    
			//Movimiento 1 (Derecha)
			if(mov==1){
				if(columnaactual+1!=columnas) { ////NO esta unido con el if de abajo porque primero tiene que hacer esa consulta, porque si hace las dos a la vez me da error.
					if(espacio[filaactual][columnaactual+1]!='*' && columnaactual<columnas ) {
						espacio[filaactual][columnaactual+1]='@'; 
						columnaactual=columnaactual+1;
						} else { System.out.println("Error.No se puede realizar ese movimiento.");}
				} else { System.out.println("Error.No se puede realizar ese movimiento.");}
			}
			
			//Movimiento 2 (Abajo)
			else if(mov==2) {
				if(filaactual+1!=filas) {//NO esta unido con el if de abajo porque primero tiene que hacer esa consulta, porque si hace las dos a la vez me da error.
					if(espacio[filaactual+1][columnaactual]!='*' && filaactual<filas) {
						espacio[filaactual+1][columnaactual]='@';
						filaactual=filaactual+1;
						} else { System.out.println("Error.No se puede realizar ese movimiento.");}
				} else { System.out.println("Error.No se puede realizar ese movimiento.");}
			}
			
			//Movimiento 3 (Abajo y Derecha)
			else if(mov==3) {
				if(filaactual+1!=filas && columnaactual+1!=columnas) {//NO esta unido con el if de abajo porque primero tiene que hacer esa consulta, porque si hace las dos a la vez me da error.
					if(espacio[filaactual+1][columnaactual+1]!='*') {
						espacio[filaactual+1][columnaactual+1]='@';
						filaactual=filaactual+1;
						columnaactual= columnaactual+1;
						} else { System.out.println("Error.No se puede realizar ese movimiento."); }
			    } else { System.out.println("Error.No se puede realizar ese movimiento."); }
			}
			
			//Si ponemos otro numero, ERROR!!
			else { System.out.println("Error. Numero erroneo.");}
			
			
			//Pinta el array actualizado
			for(int i=0;i<filas;i++){
				System.out.print("        ");
				for(int j=0;j<columnas;j++){
					System.out.print(espacio[i][j]+ " ");
					}
				System.out.println("\n");
			    }
			
			// Si ha llegado al final
			if(filaactual==filafin && columnafin==columnaactual){
				terminado=true; // si he llegado a la casilla final, sale del bucle.
				} else {
			    // compruebo si esta atrapado
					if(filaactual+1==filas) { //NO esta unido con el if de abajo porque primero tiene que hacer esa consulta, porque si hace las dos a la vez me da error.
						if(espacio[filaactual][columnaactual+1]=='*') {
							atrapado=true; //Estoy abajo del todo y compruebo si puedo moverme a la derecha.
							}
						} else if(columnaactual+1==columnas) { //NO esta unido con el if de abajo porque primero tiene que hacer esa consulta, porque si hace las dos a la vez me da error.
							if(espacio[filaactual+1][columnaactual]=='*') {
								atrapado=true; //Estoy a la derecha del todo y compruebo si puedo moverme hacia abajo
								}
							} else {
								if(espacio[filaactual][columnaactual+1]=='*' && espacio[filaactual+1][columnaactual]=='*'&&espacio[filaactual+1][columnaactual+1]=='*') {
									atrapado=true; //Si estoy rodeado de asteriores.
									} 
								}
					}
			}//Cerramos el While
		
		if(terminado){
			System.out.println("---------------------");
			System.out.println("GANASTE! Has llegado el final. ");
			System.out.println("---------------------");
			} else{
				System.out.println("---------------------");
				System.out.println("PERDISTE! No ha podido llegar hasta el final. Estas atrapado");
				System.out.println("---------------------");
				}
			
	

	}

}
