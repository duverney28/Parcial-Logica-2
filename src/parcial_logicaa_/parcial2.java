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
public class parcial2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) // // parcial punto 2 Figura
    {
       int f;
       int h;     // definimos las variables
     
     for (f=4;f>=0;f--)  // f=4, asi decidimos con este ciclo, el numero de columnas que queremos que aparezca.
       {
          for (h=0;h<=f;h++) // este ciclo lo ponemos, para que de las vueltas por cada columna
          {
           
             System.out.print("*"); // cada vez que pasa el ciclo anterior, imprimirá una aterisco.
          
          }
          System.out.println(" "); // le hago para que me de un espacio y haga un salto de linea
       }
           
           
    }
        
       
}
