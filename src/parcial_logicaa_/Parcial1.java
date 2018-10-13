/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;
import java.util.Scanner; // importamos de la libreria el util scanner
/**
 *
 * @author Equipo510
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // parcial punto 1, logica de programación
        
        Scanner sc = new Scanner(System.in); // coloco esto para que me lea el util.scanner
        try{ // coloco el try para asegurarme que el numero que me escriban por teclado sea entero
            
        System.out.println("ingrese un primer numero"); // muestro por pantalla un mensaje para recibir un numero por teclado
        
        int numero1=sc.nextInt(); // el programa me coje el numero ingresado por pantalla y lo almacena en la variable numero 1
        
        System.out.println("ingrese un segundo numero"); // un system para recibir un numero por pantalla
        
        int numero2=sc.nextInt(); // me almacena el segundo numero ingresado en la variable numero2
        
        int sumatoria=numero1+numero2; // creo una nueva variable tipo entera la cual queda valiendo la suma de mis dos variables anteriores
        System.out.println("la sumatoria es "+sumatoria); // muestro por pantalla la variable final que me dara la suma
  
        }
        catch (Exception e){ // hace parte del try 
                
        System.out.println("no coloque numeros decimales ni letras"); // mensaje que se muestra si se me ingresa un numero por pantalla decimal o letra
        }
        
    
    }
    
}
