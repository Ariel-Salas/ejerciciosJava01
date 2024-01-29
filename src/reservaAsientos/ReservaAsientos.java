package reservaAsientos;

import java.util.Scanner;

    public class ReservaAsientos {
    public static void main(String[] args) {
                
                // utilizar una matriz, char para que sea mas eficiente
                char asientos[][]=new char [10][10];
                boolean centinela=false;
                Scanner teclado = new Scanner(System.in);
                int fila,columna;
                String respuesta;

                //para recorrer una matriz o vector se utiliza una estructura repetitiva
                for(int f=0;f<asientos.length;f++){
                    for(int c=0;c<asientos.length;c++){
                        asientos[f][c]='L';
                    }
                }

        System.out.println("Bienvenidos chavales");

        //bucle controlado por centinela
        while(centinela!=true){
            System.out.println("¿Desea ver los asientos disponibles?");
            //llamar a método
            mapaMatriz(asientos);
          


            System.out.println("Ingrese fila y columna");
            System.out.print("Fila entre 0 y 9 ");
            fila=teclado.nextInt();

            System.out.print("columna entre 0 y 9 ");
            columna=teclado.nextInt();


            if(asientos[fila][columna]==('L')){
                asientos[fila][columna]='X';
                System.out.println("El asiento fue ocupado correctamente");
            }
            else{
                System.out.println("Lo siento, el asiento se encuentra ocupado");
            }
            System.out.println("¿Desea finalizar la reserva? S: Sí, cualquier otra tecla para continuar " );
            respuesta=teclado.next();

            if (respuesta.equalsIgnoreCase("S")){
                centinela=true;
            }


        }

    }

static void mapaMatriz(char asientos[][]){
    for(int f=0;f<asientos.length;f++){
        System.out.print(f+" ");
        for(int c=0;c<asientos.length;c++){
            


            System.out.print("[" + asientos[f][c] + "]");
        }
        System.out.println("");
    }






    }
}
