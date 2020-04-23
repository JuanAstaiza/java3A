/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author juanc
 */

public class Suma_vectores_y_ultimo_penultimo {
   public static void main(String[] args){      
        Scanner keyboard = new Scanner(System.in);
        int Numeros[] =new int[10000];
        int cont=0,n=0;
        System.out.println("");
        System.out.println(":::::::: SUMA DEL PENULTIMO Y ULTIMO NUMERO EN UN VECTOR ::::::::");
        System.out.println("");
        while(cont!=10000){
            cont=cont+1;
            System.out.println("Digite un numero: ");
            n=keyboard.nextInt();
            Numeros[cont] = n;
            if(cont>=3){
                
                int d = Numeros[cont-1] + Numeros[cont-2]; 
               
                if (d == Numeros[cont]){
                    System.out.println("");
                    System.out.println("ERROR. NO es posible agregar ese número. Intente Nuevamente.");
                    System.out.println("La suma del  último y penúltimo es igual a el valor ingresado ");
                    System.out.println("");
                    cont--;
                }
            }
            if (cont==2) {
                int d = Numeros[cont-1] + Numeros[cont]; 
                System.out.println("La suma es : "+d);
            }else if(cont==1){
                System.out.println("La suma es : "+Numeros[cont]);
            }                
         }
           
    }

}
