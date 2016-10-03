/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

import java.util.Scanner;

/**
 *
 * @author itrascastro
 */
public class TiposDatos {

    private static final Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TiposDatos.ejercicio1();
        //TiposDatos.ejercicio2();
        //TiposDatos.ejercicio3();
        // TiposDatos.ejercicio4();
    }

    public static void ejercicio1() {
        System.out.println("Introduce un número");
        int n1 = teclado.nextInt();
        System.out.println("Has introducido el número " + n1);
    }

    public static void ejercicio2() {
        System.out.println("Introduce un número");
        int n1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        int n2 = teclado.nextInt();
        
        if (n1 < n2) {
            System.out.println("El primero es el menor");
        } else if (n2 < n1) {
            System.out.println("El segundo es el menor");
        } else {
            System.out.println("Son iguales");
        }
    }
    
    public static void ejercicio3() {
        System.out.println("Introduce un número");
        int n1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        int n2 = teclado.nextInt();

        int resultado = n1 + n2;
        
        System.out.println(n1 + " + " + n2 + " = " + resultado);
    }
    
    /**
     * Calculadora
     */
    public static void ejercicio4() {
        int n1;
        int n2;
        int res;
        int opcion;
        
        System.out.println("Elige una opcion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        opcion = teclado.nextInt();
        
        System.out.println("Introduce el primer número");
        n1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        n2 = teclado.nextInt();
        
        if (opcion == 1) {
            res = n1 + n2;
        } else if (opcion == 2) {
            res = n1 - n2;
        } else if (opcion == 3) {
            res = n1 * n2;
        } else {
            res = (int) (n1 / n2);
        }
        
        System.out.println("Resultado: " + res);
    }
    
    /**
     * El mayor de 3 números
     */
    public static void ejercicio5()
    {
        int n1, n2, n3;
        int mayor;
        
        System.out.println("Introduce el primer número");
        n1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        n2 = teclado.nextInt();
        
        System.out.println("Introduce el tercer número");
        n3 = teclado.nextInt();
        
        if (n1>n2 && n1>n3) {
            mayor = n1;
        } else if (n2>n1 && n2>n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        System.out.println("El mayor es: " + mayor);
        
    }

}
