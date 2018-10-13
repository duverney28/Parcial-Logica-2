/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;

import java.util.Scanner; // llamamos la libreria Java.util.scanner

/**
 *
 * @author Administrador
 */
public class parcial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // parcial punto 3
       
     int edad;
     String nombrePersona,color,nombreCosa; // Definimos las variables tipo entero y tipo string
              
        Scanner entrada = new Scanner(System.in); // Esto nos guardara el dato que ingresemos en la libreria 
        
        System.out.println("ingrese un nombre de una persona");
        nombrePersona= entrada.nextLine ();                     // Pedimos un nombre
       
        System.out.println("ingrese un color");
        color= entrada.nextLine ();                             // pedimos un color
       
        System.out.println("ingrese una el nombre de una cosa");
        nombreCosa= entrada.nextLine ();                        // pedimos el nommbre de una cossa
        
        System.out.println("ingrese una edad");
        edad= entrada.nextInt ();                               // pedimos una edad
        
        
      System.out.println("En el pueblo de Tamarindo(nariño), nació un/a joven llamado/a " + nombrePersona + "\n"  
      + "era muy inteligente, ya que desde pequeño/a sobresalia por ser un/a de los mejores en el colegio y siempre obtener las mejores calificaciones, y gracias a ello creó un artefacto llamado "  + nombreCosa + "\n"
      + "del color " + color + " con la edad de "  + edad + " años, asi se hizo muy reconocido/a en el pueblo y tambien en todo el pais. \n"
      + "Esto conllevó a que recibiera premios en todas las ciudades, ya que era algo nunca antes visto en colombia ");
        
      // Este paso nos mostrata por pantalla la historia, con los datos ingresados.
    
    }
    
}
