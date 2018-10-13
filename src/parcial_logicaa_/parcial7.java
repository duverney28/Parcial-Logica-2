/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;

/**
 *
 * @author Duverney Diaz Cano
 */
public class parcial7 {

   
     // parcial punto 7 multiplicacion de matrices 3x3
           
    
    public static boolean multiplicacionmatrices(int [][] m1,int [][] m2, int [][]m3){ // me creo mi primera funcion booleana que tenga los tres parametros de mis tres matrice
      // m1,m2,m3 la ultima m3 sera el resultado de la multiplicacion de mis dos matrices
        boolean compatible= true; // me creo una variable booleana y la inicializo en true
        
        if (m1[0].length != m2.length) // si las columnas de la matriz m1 no coinciden con las columnas de la matriz m2 mi compatible sera falso
            compatible= false; // al no ser compatible no nos hara absolutamente nada 
        
        else  // de lo contrario
            for (int f=0; f< m1.length; f++) { // hago este for para recorrer las filas
               for ( int c=0; c<m2[f].length; c++){   // hago este for para recorrer mis columnas
                  for (int k=0; k< m2.length; k++){  // hago ete for para recorrer mis columnas nuevamente basandome en que k sea menor a la matriz m2
                      
                      m3 [f][c]+= m1[f][k]* m2 [k][c]; // la multiplicacion de las dos matrice y la suma de cada multiplicacion sera almacenada en la m3 ( matriz 3)
                   
                    }
            
                }
        
            }
    
    return compatible; // retornamos la variable compatible
    
    
}
  public static void vermatriz (int[][] m){ // me creo una segunda funcion llamada vermatriz (clase de funciones la cual aprendimos la clase pasada)
      System.out.println("la matriz resultante es:"); // muestro por pantalla mi matriz resultante
      for (int f=0; f <m.length; f++){ // for para recorrer las filas
          for (int c=0; c< m[f].length; c++) { //for recorrer columnas
              System.out.print(m[f][c]+" "); // hago un print para sacar los valore que hay en filas y los valores de mis columnas
          }
          System.out.println(); // hago este print para un salto de linea y que queden separados
        }
    } 
    
    public static void main(String[] args) { // me creo mi main normal para asi poder llamar mis funciones echas anteriormente
        int [][] m1= {{1,4,7}, // me creo mi primera matriz tal cual esta en el parcial 
                      {2,5,8},
                      {3,6,9}};
       int [][] m2= {{1,-1,2},  // me creo la segunda matriz la cual sera multiplicada por la primera
                      {2,-1,2},
                      {3,-3,0}};
    
       int [][] m3= new int [3][3]; // me creo la matriz la cual guardara la multiplicacion de la primera por la segunda, debo poner bien el ancho o largo de mi matriz, en este caso 3*3
       if (multiplicacionmatrices(m1,m2,m3)) // llamamos mi primera funcion, si multiplicamos la matriz m1*m2 nos resultara la m3,esta funcion basicamente nos multiplicara nuestras matrices 
           vermatriz (m3); //  llamamos la segunda funcion para que me muestre la matriz resultante (ponemos m3 ya que es nuestra matriz resultante) 
       
    }
    
}
    


