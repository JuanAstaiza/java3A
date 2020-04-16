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
public class numeros_Aleatorios {
    
    public static void main(String[] args) {
        //Prograna para generar valores aleatorios
        
        int num=0,valor_A=0,limI=0,limS=0;
        boolean b=false;
        int parP=0,parN=0,imparP=0,imparN=0,sumPN=0;
        
        Scanner lector=new Scanner(System.in);       
        
        System.out.println("PROGRAMA DE NUMERO ALEATORIOS PARES Y IMPARES");
        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.err.println("NOTA:  El LIMITE INFERIOR no debe ser mayor que el LIMITE SUPERIOR.");
        System.out.println("");
        System.out.println("Ingrese el numero de valores aleatorios a general: ");
        valor_A=lector.nextInt();    
        
       while(b!=true){     
            System.out.println("Digite el limite Superior a mostrar: ");
            limS=lector.nextInt();
            System.out.println("Digite el limite Inferior a mostrar: ");
            limI=lector.nextInt();
            System.out.println("");
           if (limI>limS) {
                b=false;
                System.out.println("____________________________________________________________________");
                System.out.println("ERROR. El LIMITE INFERIOR no debe ser mayor que el LIMITE SUPERIOR.");
                System.out.println("____________________________________________________________________");
            }else{
               b=true;
            }
        }
        System.out.println("");
        System.out.println("Los numeros aleatorios de "+limI+" al "+limS+ " son:");
        for (int i = 0; i < valor_A; i++) {
            num = (int) (Math.random()*limS+limI);   
            System.out.println(num);
            if (num!=0) {
                if(num % 2 == 0){//Pares
                if(num>0){//Par positivo
                    parP++;
                }else{ //Par negativo
                    parN++;
                    sumPN=sumPN+num;
                }
                }else{//Impares
                    if(num>0){//Par positivo
                        imparP++;
                    }else{ //Par negativo
                        imparN++;
                    }                
                }
            }
        }
        System.out.println("");
        System.out.println(" RESULTADOS ");
        System.out.println("------------------");
        System.out.println("Total de pares positivos generados: "+parP);
        System.out.println("Total de impares positivos generados: "+imparP);
        System.out.println("Total de pares negativos generados: "+parN);
        System.out.println("Total de impares negativos generados: "+imparN);
        System.out.println("Suma total de pares negativos generados: "+sumPN);
    }
}
