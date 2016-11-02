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
public class TiposDatos {

    private static final Scanner teclado = new Scanner(System.in);
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TiposDatos.ejercicio1();
        //TiposDatos.ejercicio2();
        //TiposDatos.ejercicio3();
        // TiposDatos.ejercicio4();
        TiposDatos.generarSerie();
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
     * Tres números ordenados
     */
    public static void ejercicio5()
    {
        int n1, n2, n3;
        int mayor, medio, menor;
        
        System.out.println("Introduce el primer número");
        n1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        n2 = teclado.nextInt();
        
        System.out.println("Introduce el tercer número");
        n3 = teclado.nextInt();
        
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        if (mayor == n1) {
            if (n2 > n3) {
                medio = n2;
                menor = n3;
            } else {
                medio = n3;
                menor = n2;
            }
        } else if (mayor == n2) {
            if (n1 > n3) {
                medio = n1;
                menor = n3;
            } else {
                medio = n3;
                menor = n1;
            }
        } else {
            if (n1 > n2) {
                medio = n1;
                menor = n2;
            } else {
                medio = n2;
                menor = n1;
            }
        }
        System.out.println("Los números ordenados son: " 
                + mayor + " " + medio + " " + menor);
    }
    
    public static void ejercicio6()
    {
        int n, n1;
        
        n = aleatorio.nextInt(10);
        n1 = teclado.nextInt();
        
        if (n1 == n) {
            // acierto a la primera
        } else {
            n1 = teclado.nextInt();
            if (n1 == n) {
                // acierto a la segunda
            } else {
                n1 = teclado.nextInt();
                if (n1 == n) {
                    // acierto a la tercera
                } else {
                    // No hay más intentos
                }
            }
        }
    }
    
    public static void ejercicio7()
    {
        double nota;
        String calificacion;
        
        System.out.println("Introduce una nota");
        nota = teclado.nextDouble();
        
        if (nota < 5) {
            calificacion = "Suspenso";
        } else if (nota >= 5 && nota < 6.5) {
            calificacion = "Aprobado";
        } else if (nota >= 6.5 && nota < 7) {
            calificacion = "Bien";
        } else if (nota >= 7 && nota < 8.5) {
            calificacion = "Notable";
        } else if (nota >= 8.5 && nota < 9.75) {
            calificacion = "Excelente";
        } else {
            calificacion = "Matricula";
        }
        
        System.out.println(calificacion);
    }
    
    /**
     * Tabla Multiplicar
     */
    public static void ejercicio8() {
        int cnt;
        int n;
        int res;
        
        System.out.println("Introduce un número");
        n = teclado.nextInt();
        
        for (cnt=0; cnt < 11; cnt++) {
            res = cnt * n;
            System.out.println(n + " x " + cnt + " = " + res);
        }
    }
    
    /**
     * Tabla Multiplicar sin For
     */
    public static void ejercicio9() {
        int n = 3;
        
        System.out.println(n + " x " + 0 + " = " + (n * 0));
        System.out.println(n + " x " + 1 + " = " + (n * 1));
        System.out.println(n + " x " + 2 + " = " + (n * 2));
        System.out.println(n + " x " + 3 + " = " + (n * 3));
        System.out.println(n + " x " + 4 + " = " + (n * 4));
    }
    
    /**
     * Factorial
     */
    public static void ejercicio10() {
        int n;
        int factorial = 1;
        int cnt;
        
        System.out.println("Introduce un número");
        n = teclado.nextInt();
        
        for (cnt = 1; cnt <= n; cnt++) {
            factorial = factorial * cnt;
        }
        
        System.out.println(factorial);
        
    }
    
    /**
     * Sumas parciales
     */
    public static void ejercicio11() {
        int cnt;
        int suma = 0;
        int n;
        
        System.out.println("Introduce un número");
        n = teclado.nextInt();
        
        for (cnt = 1; cnt <= n; cnt++) {
            suma = suma + cnt;
        }
        
        System.out.println("El valor de la suma es: " + suma);
    }
    
    public static void ejercicio12() {
        int cnt;
        int suma = 0;
        int n, res;
        
        for (cnt = 0; cnt <= 100; cnt++) {
            n = aleatorio.nextInt(10);
            if (n == 4) {
                break;
            }
            suma = suma + n;
        }
        
        res = suma / cnt;
        
        System.out.println("El valor de la media es: " + res);
    }
    
    public static void diaSemana()
    {
        int num;
        
        System.out.println("Introduce un número");
        num = teclado.nextInt();
        
        switch (num) {
            case 1: 
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
                
        }
        
    }
    
    public static void readChar()
    {
        char c, acta;
        int valor;
        
        c = teclado.next().charAt(0);
        
        valor = (int) c;
        
        if (valor < 65 || (c > 90 && c < 97) || c > 122) {
            // no letras
        } else if (c == 'a' || c == 'e') {
            // vocales
        } else {
            // consonantes
        }
        
        switch(c) {
            case 0: acta = 'S';
                    break;
            case 1:
            case 2:
            case 3:
            case 4:
                //suspenso
                break;
            default:
                //else
                
        }
        
    }
    
    public static void ejemploWhile()
    {
        int cnt;
        
        for (cnt = 0; cnt < 10; cnt++) {
            System.out.println(cnt);
        }
        
        cnt = 0;
        while (cnt < 10) {
            System.out.println(cnt);
            cnt++;
        }
        
        cnt = 0;
        do {
            System.out.println(cnt);
            cnt++;
        } while (cnt < 10);
    }
    
    public static void generarSerie()
    {
        int par = 2;
        int n = 20;
        int cnt = 1;
        int suma = 0;
        
        System.out.println(par);
        
        for (par = 2; par <= n * 2; par = par + 2) {
            System.out.println(par);
            suma = suma + par;
        }
        
        while (cnt <= n) {
            par = par + 2;
            System.out.println(par);
            suma = suma + par;
            cnt++;
        }
        
        do {
            par = par + 2;
            System.out.println(par);
            suma = suma + par;
            cnt++;
        } while (cnt <= n);
        
        for (cnt = 2; cnt <= n; cnt++) {
            par = par + 2;
            System.out.println(par);
            suma = suma + par;
        }
        
    }

}
