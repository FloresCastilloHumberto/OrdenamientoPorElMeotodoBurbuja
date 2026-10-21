/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.arreglos;
import java.util.Arrays;
/**
 *
 * @author Humbe
 */
public class pryOrdenamientoBurbujaTradicionaYMejorada {
    
    //Ordenamiento por el metodo burbuja tradicional
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length; //Determina el tamaño del arreglo
        for (int i = 0; i < n - 1; i++) { //Recorre el arreglo.
            for (int j = 0; j < n - 1 - i; j++) {  //Compara los elementos de al lado.
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    //Ordenamiento por el metodo burbuja tradicional
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length; //Determina el tamaño del arreglo
        boolean huboIntercambio; //La bandera que permite parar el ordenamiento

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false; // 1. Reiniciamos la bandera en cada pasada

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    huboIntercambio = true; // 2. Marcamos que sí hubo un cambio
                }
            }

            // 3. Si no hubo intercambios en toda esta pasada, salimos antes
            if (!huboIntercambio) {
                break;
            }
        }
    };
 
    public static void main(String[] args) {
        // 1. Prueba con arreglo tradicional
        int[] datos1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("--- BURBUJA TRADICIONAL ---");
        System.out.println("Original: " + Arrays.toString(datos1));
        ordenamientoBurbuja(datos1);
        System.out.println("Ordenado: " + Arrays.toString(datos1));

        // 2. Prueba con arreglo ordenado (para ver la ventaja del mejorado)
        int[] datos2 = {10, 20, 30, 50, 40};
        System.out.println("\n--- BURBUJA MEJORADO ---");
        System.out.println("Original: " + Arrays.toString(datos2));
        ordenamientoBurbujaMejorado(datos2);
         System.out.println("Ordenado: " + Arrays.toString(datos2));
    }
}
