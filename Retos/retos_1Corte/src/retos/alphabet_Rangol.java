/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Scanner;

/**
 *
 * @author JUAN CARLOS ASTAIZA
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
        
        String[] letras={"","a","b","c","d","e","f","g","h","i","j","k","l","m","ñ","o",
                        "p","q","r","t","u","w","x","y","z"};
        
        System.out.println("Digite un número: ");
        num=lector.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=i;j<num;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            for(int j=num;j>i;j--){
            System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
            System.out.print("*");
            }
        System.out.println();
        }
    
    }
    
        
}
