/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn = new Scanner(System.in);

        char[][] silla = new char[5][5];
//char silla[][]  = new char[2][2];
//        silla[0][0] = 'O';
//        silla[0][1] = 'O';
//        silla[1][0] = 'O';
//        silla[1][1] = 'O';
//        silla[2][0] = 'O';
//        silla[0][2] = 'O';
//        silla[3][0] = 'O';
//        silla[0][3] = 'O';
//        silla[4][0] = 'O';
//        silla[0][4] = 'O';
    
 

        boolean bandera = false;
//String seatOn = "O";

        for (int fila = 0; fila < 2; fila++) {
            for (int col = 0; col < 2; col++) {
                //silla.length[fila][col]='O';
                //System.out.print(" Fila: " + fila + " Columna:" + col);
                //silla[fila][col] = scn.nextInt();
                System.out.println("Ocupación del teatro//COMPRAR TICKET \n" + silla[0][0] + silla[0][1] + "\n"+  silla[1][0] + silla[1][1]+ silla[2][0]+silla[0][2]+silla[3][0]+silla[0][3]+silla[4][0]+silla[0][4]);

                if (silla[fila][col] != 'X') {
                    System.out.println("Inserte número de fila:");
                    fila = scn.nextInt();
                    System.out.println("Inserte número de columna:");
                    col = scn.nextInt();
                    if (silla[fila][col] != 'X') {

                        System.out.println("\n Introduzca X para su compra: ");
                        silla[fila][col] = scn.next().charAt(0);
                    } else {
                        System.out.println("Asiento ocupado");
                    }

                }

            }

            System.out.println();

        }
        // Recorrido/Muestra de una matriz
        System.out.println("Ocupación del teatro ");
        for (int fila = 0; fila < 2; fila++) {
            for (int col = 0; col < 2; col++) {
                System.out.println("TICKET \n" + silla[0][0] + silla[0][1] + "\n" + silla[1][0] + silla[1][1]);
            }
            System.out.println();

        }


        
    }
    
}
