/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Aula1
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMA PARA COMPARAR DOS NUMEROS
       int a=4,b=4;
        if(a>b){
           System.out.print("El mayor es:"+ a);          
        }else if(a<b){
           System.err.println("El mayor es: "+b);           
        }else{
           System.out.print("Son iguales.");
        }
    }
    
}
