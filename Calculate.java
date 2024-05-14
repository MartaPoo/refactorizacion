/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refactorizacion;

/**
 *
 * @author Marta Romero Poo
 */

 /**
  * CÓDIGO SIN REFACTORIZAR:
       public static void calculate(int a, int b) {
           int temp = a + b;
           System.out.println("Suma of a and b: " + temp);
           temp = a - b;
           System.out.println("Diferencia of a and b: " + temp);
           temp = a * b;
           System.out.println("Producto of a and b: " + temp);
           temp = a / b;
           System.out.println("Cociente of a and b: " + temp);
       }
 */

//CÓDIGO REFACTORIZADO:
public class Calculate {
    
 public static void calculate(int a, int b) {
        //Entorno
            int suma, diferencia, producto, cociente;

        // Algoritmo
            suma = a + b;
            System.out.println("Suma de a y b: " + suma);

            diferencia = a - b;
            System.out.println("Diferencia de a y b: " + diferencia);

            producto = a * b;
            System.out.println("Producto de a y b: " + producto);

            if (b != 0) {
                cociente = a / b;
                System.out.println("Cociente de a y b: " + cociente);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
    }

}