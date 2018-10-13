
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;

/**
 *
 * @author Administrador
 */
public class Parcial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // parcial punto 4, logica de programación vector de 10 numeros enteros
    
            int [] espacio  = {10,5,1,20,3,6,90,6,12,10};
            int menornum = 0 ;  //definimos las variables tipo entero y la matriz con los numeros que queremos ordenar.
                                                   
            
            for(int i = 0; i < 10; i++) // ciclo para analizar las filas.
            {
               for(int h=0; h < 10-1;h++ ) // ciclo para analizar cada columna y h vale = 0
               {
                 if (espacio[h]> espacio[h+1]) // espacio me analizara si en la posicion h que es cero, es mayor a la siguiente posicion.
                 {                             // si se cumple, hace el procedimiento de abajo
                  
                  menornum = espacio[h];//como menormum lo inicializamos en cero, le pedimos que guarde el resultado de la posicion 0 que es h.
                   
                  espacio[h]=espacio[h+1]; // le digo que el resultado que hay en la posicion siguiente, lo guarde en la posicion anterior.
                   
                  espacio[h+1]=menornum; // como menornum ya tiene el resultado de la posicion en la que estamos, le pedimos que ese valor se lo ponga a la siguiente posicion.
                 
                  // Cuando el ciclo termina, la h aumenta un numero mas.
                 
                 }
               }
            }
            int u=0; 
            System.out.println("Ordenado:" ); 
            while(1<10)                          
            {                                     // le digo que me imprima por pantalla el valor que hay en la matriz espacio 
                System.out.println(espacio[u]);     // mientras el resultado de u sea menor a 10; cuando termine u ira aumentando su valor
                u++;
            }
    }
}
