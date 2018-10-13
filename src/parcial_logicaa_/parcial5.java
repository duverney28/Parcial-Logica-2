/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;

import java.util.Random; // primero que todo exporto esta clase

/**
 *
 * @author Duverney Diaz Cano
 */
public class parcial5 {

    /**
     * @param args the command line arguments
     */ // // parcial punto 5
    public static void main(String[] args) {
        Random r = new Random(); // declaro mi variable random
        int [][] duv= new int[10][10]; // declaro mi matriz 
        int sumadiagonal=0; // creo una variable a la cual le asignare la suma de la diagonal de mi matriz
        
        
        for (int f=0; f<duv.length; f++) { // inicio mi ciclo for para mis filas
           
           for (int c=0; c< duv[1].length; c++) { // ciclo for para mis columnas
               
               duv [f][c]=r.nextInt (9); // declaro mis numeros aleatorios para mi matriz con un limite de 9
               System.out.print(duv [f][c]); // imprimo mi matriz
               System.out.print(" "); // pongo espacios entre mis numeros enteros
               
               
           } 
                   
            System.out.println(" ");    
        }
        
        for (int d=0; d< duv.length;d++) { // incio ete ciclo para recorrer la diagonal de mi matriz
            System.out.print(duv [d][1]);  
            System.out.print(" ");
            sumadiagonal= sumadiagonal+ duv [d][1]; // variable que me almacena la suma de los valores de la diagonal
        }
        
        System.out.println("la suma de la diagonal es"+sumadiagonal);   // me muestra la suma de mi Diagonal
        
    }
    
}  // fin de mi codigo
