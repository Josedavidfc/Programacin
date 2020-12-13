package UT4;

import java.util.Scanner;

public class trabajofinal {
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
		
		System.out.println("Introduce numefro de filas: ");
		filas = sc.nextInt();
		System.out.println("Introduce numefro de columnas: ");
		columnas = sc.nextInt();
		espacio = new char [filas][columnas]; // creo el array con tamaño fila columna
		filaini=0; // casilla inicial
		columnaini=0;
		filafin=filas-1; // casilla final
		columnafin=columnas-1; 
		filaactual=filaini; // actualizo casiulla inicial
		columnaactual=columnaini;
		
		char[] c= {'*', '.'}; // array con los caracteres para rellenar
		// rellenar el array
		 for(int i=0;i<filas;i++){
			 for(int j=0;j<columnas;j++){
				 espacio[i][j]=c[(int)(Math.random()*2)]; // mirar que ees longituad
			 }
		 }
		 espacio[filaini][columnaini]='@'; // pongo la casilla inicial
		 espacio[filafin][columnafin]='@'; // pongo la casilla fin

		 //pintar tablero inicial
		 for(int i=0;i<filas;i++){
			 for(int j=0;j<columnas;j++){
					System.out.print(espacio[i][j]);
			 }
			 System.out.println("");
		 }
		 

         while(!atrapado && !terminado) {
        	 
        	 System.out.println("MOVIMIENTOS:");
    		 System.out.println("1. Derecha");
    		 System.out.println("2. Abajo");
    		 System.out.println("3. Abajo y derecha");
    		 mov = sc.nextInt();
    		 
    		 if(mov==1){
    			 if(espacio[filaactual][columnaactual+1]!='*' && columnaactual<columnas ) {
    				 espacio[filaactual][columnaactual+1]='@';
    				 columnaactual=columnaactual+1;
    			 }
    			 else {
    				 System.out.println("Error.No se puede realizar ese movimiento.");
    			 }
    		 }
    		 else if(mov==2) {
    			 if(espacio[filaactual+1][columnaactual]!='*' && filaactual<filas) {
    				 espacio[filaactual+1][columnaactual]='@';
    				 filaactual=filaactual+1;
    			 }
    			 else {
    				 System.out.println("Error.No se puede realizar ese movimiento.");
    			 }
    		 }
    		 else if(mov==3) {
    			 if(espacio[filaactual+1][columnaactual+1]!='*') {
    				 espacio[filaactual+1][columnaactual+1]='@';
    				 filaactual=filaactual+1;
    				 columnaactual= columnaactual+1;
    			 }
    			 else {
    				 System.out.println("Error.No se puede realizar ese movimiento.");
    			 }
    		 }
    		 
    		 
    		 else {
    			 System.out.println("Error. Numero erroneo.");
    		 }


        	 
        	 
        	//pintar
    		 for(int i=0;i<filas;i++){
    			 for(int j=0;j<columnas;j++){
    					System.out.print(espacio[i][j]);
    			 }
    			 System.out.println("");
    			 
    		 }
    		 // compruebo si esta atrapado
    		 if(espacio[filaactual][columnaactual+1]!='*' && espacio[filaactual+1][columnaactual]!='*'&&espacio[filaactual+1][columnaactual+1]!='*') {
    			 atrapado=true;
    		 }
    		 else if(espacio[filaactual][columnaactual+1]!='*' && filaactual+1==filas) {
    			 atrapado=true;
    		 }
    		 else if(espacio[filaactual+1][columnaactual]!='*' && columnaactual+1==columnas) {
    			 atrapado=true;
    		 }
    		 // si ha llegado al final
    		 else if(filaactual==filafin && columnafin==columnaactual){
    			 terminado=true;
    		 }
         }
         if(terminado){
 			System.out.println("Ha llegado el final");
 		}
         else{
			System.out.println("No ha podido llegar hasta el final. estas atrapado");
		}
	}
}
