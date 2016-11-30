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
public class Arrays {
    
    private static final Scanner teclado = new Scanner(System.in);
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays.sumaArray();
    }
    
    public static void arraysEj1() {
        int[] a = {1, 10, 3, -1, 5, 9};
        int i;
        int min = a[0];
        
        for (i=1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        
        System.out.println("El menor es: " + min);
    }
    
    public static void imprimirArray() {
        int[] a = {2, 4, 0, 0, 0, 2, -1};
        int i;
        
        for (i=0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void sumaArray() {
        int[] a = {3, 1, 0, 0, 0};
        int i;
        int suma = 0;
        
        for (i=0; i < a.length; i++) {
            suma = suma + a[i];
        }
        
        System.out.println("La suma es: " + suma);
        
    }
    
    public static void buscar() {
        int[] a = {3, 1, 4, -1, 10};
        int[] b = new int[5];
        int i = 0;
        int n;
        boolean encontrado = false;
        
        System.out.println("Introduce un número:");
        n = teclado.nextInt();
        
        while (!encontrado && i < a.length) {
            if (a[i] == n) {
                encontrado = true;
            }
            i++; 
        }
        if (encontrado) {
            System.out.println("El número está en la pos " + (i - 1));
        } else {
            System.out.println("El número no está");
        }
    }
}
