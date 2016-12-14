/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author itrascastro
 */
public class Arrays2Dimensiones {
    private static final Scanner teclado = new Scanner(System.in);
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays2Dimensiones.diagonal();
    }
    
    public static void imprimir(int [][]a, int numFilas, int numCols) {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(a[i][j] + " ");
            }
            // fin de fila i
            System.out.println("");
        }
    }
    
    public static void diagonal() {
        int[][] a = {
                        {2, 3, 4}, 
                        {3, 5, 6},
                        {1, 2, 6}
                    };
        
        Arrays2Dimensiones.imprimir(a, 3, 3);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
            }
        }
        
        System.out.println("");
        
        Arrays2Dimensiones.imprimir(a, 3, 3);
    }
    
    public static void sumar() {
        int[][] a = {
                        {2, 3, 4}, 
                        {3, 5, 6},
                        {1, 2, 6}
                     };
        
        Arrays2Dimensiones.imprimir(a, 3, 3);
        
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + a[i][j];
            }
        }
        
        System.out.println("La suma vale: " + suma);
    }
    
    public static void sumarFilasCols() {
        int[][] a = {
                        {2, 3, 4}, // 9
                        {3, 5, 6}, // 14
                        {1, 2, 6}  // 9
                //      6, 10, 16
                    };
        
        int sumaFil;
        int sumaCol;
        String salidaCol = "";
        
        for (int i = 0; i < 3; i++) {
            sumaFil = 0;
            sumaCol = 0;
            for (int j = 0; j < 3; j++) {
               System.out.print(a[i][j] + " ");
               sumaFil = sumaFil + a[i][j]; 
               sumaCol = sumaCol + a[j][i];
            }
            System.out.println("| " + sumaFil);
            salidaCol = salidaCol + sumaCol + " ";
        }
        
        System.out.println(salidaCol);
    }
    
}
