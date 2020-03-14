/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author JUAN CARLOS ASTAIZA ORDOÑEZ
 */
public class alphabet_Rangol {
    
    
    public static void main(String[] args) {
        /*
        Se le da un número entero, . Su tarea es imprimir un alfabeto rangoli de 
        tamaño . (Rangoli es una forma de arte popular indio basado en la creación
        de patrones).        
        */
        
        Scanner lector=new Scanner(System.in);
        
        int num=0;
        boolean b=true;
        
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("PROGRAMA QUE GENERA UN TRIANGULO DE ACUERDO AL NUMERO DADO POR EL USUARIO");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("");
        
        System.out.println("NOTA: El numero ingresado debe estar entre 1 y 27.");
        
        String[] alfabeto={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o",
                        "p","q","r","s","t","u","v","w","x","y","z"};
        
        
        while(b!=false){
            System.out.println("Ingrese un número: ");
            num=lector.nextInt();
            if(num>=28 || num<=0){
                System.out.println("NUMERO INCORRECTO.");
                b=true;
            }else{
                b=false;
            }
        }

        int ajuste1=num-1;
        int ajuste2=num+1;
        int ajuste3=1;
        int ajuste4=3;
        for(int f=num;f>=1;f--){
           System.out.println(" ");
           for(int i=num;i>ajuste1;i--){
              System.out.print(alfabeto[i]+" ");
           }
           for(int i=ajuste2;i<=num;i++){
              System.out.print(alfabeto[i]+" ");
           }
        ajuste2--;
        ajuste1--;
        }
        for(int f1=num;f1>=1;f1--){
           System.out.println(" ");      
            for(int j=num;j>ajuste3;j--){
               System.out.print(alfabeto[j]+" ");
            }
            for(int j=ajuste4;j<=num;j++){
              System.out.print(alfabeto[j]+" ");
           }
        ajuste4++;  
        ajuste3++;
        }
    
    }
    
        
}
