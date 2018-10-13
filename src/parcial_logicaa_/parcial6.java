/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_logicaa_;
import java.util.Scanner;
/**
 *
 * @author Duverney Diaz Cano
 */
public class parcial6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // parcial punto 6 que letra del abecedario pertenece un numero entero
        String abc[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; //declaramos nuestro string con nuestro abecedario
        Scanner sc = new Scanner(System.in); // coloco esto para que me lea el util.scanner 
        System.out.println("digite un numero"); // muestro por pantalla un mensaje para recibir un numero entero por teclado
        int posicion=sc.nextInt(); // me maneja las posiciones la cual me imprimira una letra
        System.out.println("el resultado es:"+abc[posicion-1]); // imprimo el resultado de mi abecdario mas el arreglo de mi posicion -1 para que no me salga corrida una letra
        
        
    }
    
}

