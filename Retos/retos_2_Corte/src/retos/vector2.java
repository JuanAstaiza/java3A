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
public class vector2 {
   public static void main(String[] args){      
        Scanner keyboard = new Scanner(System.in);
        int Numeros[] =new int[10000];
        int cont=0,n=0,sumatoria=0;
        
        while(cont!=10000){
            cont=cont+1;
            System.out.println("Digite un numero: ");
            n=keyboard.nextInt();
            Numeros[cont] = n;
            if(cont>=3){
                
                int d = Numeros[cont-1] + Numeros[cont-2]; 
               
                if (d == Numeros[cont]){
                     System.out.println("ERROR.");
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
