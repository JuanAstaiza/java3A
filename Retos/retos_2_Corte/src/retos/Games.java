/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos;

import java.util.Random;
import java.util.Scanner;

//Python: from random import randint, uniform, random

/**
 *
 * @author JUAN CARLOS ASTAIZA ORDOÑEZ
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CHALLENGE 1: P I P I P I P I ...
        //CHALLENGE 2: I P I P I P I P ...
        //CHALLENGE 3: P P P P P P P P ... 
        //CHALLENGE 4: I I I I I I I I ...
        //CHALLENGE 5: I P P P P P P I ...
        //CHALLENGE 6: P I I I I I I P ... 
        
        //Random numbers struture
        //(int)(N.nextDouble()* límite_superior + límite_inferior)
        
        Random N = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int op=0,x = 0, i = 0, cont=0,limit=0;
        boolean b=true;
        
        do{ 
            System.out.println("************************************************");
            System.out.println("    PROGRAMA PARA LISTAR NUMEROS ALEATORIOS     ");
            System.out.println("************************************************");
            System.out.println("(1) CHALLENGE 1: P I P I P I P I ...");
            System.out.println("(2) CHALLENGE 2: I P I P I P I P ...");
            System.out.println("(3) CHALLENGE 3: P P P P P P P P ...");
            System.out.println("(4) CHALLENGE 4: I I I I I I I I ...");
            System.out.println("(5) CHALLENGE 5: I P P P P P P I ...");
            System.out.println("(6) CHALLENGE 6: P I I I I I I P ...");
            System.out.println("(7) Salir");
            System.out.println("Escoje una opción: ");
            op=keyboard.nextInt();
            switch(op){
                case 1:
                    b=true;
                    System.out.println("CHALLENGE 1: P I P I P I P I");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        cont++;
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(cont % 2 == 0){ 
                                //(CONT) NUMEROS QUE SON PARES
                                //Aqui se van a mostrar los impares
                                if(x % 2 != 0){
                                    System.out.println(x + " es IMPAR");
                                    b=true;                                    
                                }else{
                                  b=false;  
                                }
                            }else{
                                //(CONT) NUMEROS QUE SON IMPARES
                                //Aqui se van a mostrar los pares
                                if(x % 2 == 0){
                                    System.out.println(x + " es PAR");  
                                    b=true;
                                }else{
                                    b=false; 
                                }
                            }
                        }while(b!=true);    
                    }
                       break;
                case 2:
                    b=true;
                    cont=0;
                    System.out.println(" CHALLENGE 2: I P I P I P I P ...");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        cont++;
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(cont % 2 == 0){ 
                                //(CONT) NUMEROS QUE SON PARES
                                //Aqui se van a mostrar los pares
                                if(x % 2 == 0){
                                    System.out.println(x + " es PAR");
                                    b=true;
                                }else{
                                  b=false;  
                                }
                            }else{
                                //(CONT) NUMEROS QUE SON IMPARES
                                //Aqui se van a mostrar los impares
                                if(x % 2 != 0){
                                    System.out.println(x + " es IMPAR");  
                                    b=true;
                                }else{
                                    b=false; 
                                }
                            }
                        }while(b!=true);    
                    }
                       break;
                case 3:
                    b=true;
                    System.out.println(" CHALLENGE 3: P P P P P P P P ...");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(x % 2 == 0){  
                                //(CONT) NUMEROS QUE SON PARES Y IMPARES
                                //Aqui se van a mostrar los pares
                                System.out.println(x + " es PAR");
                                b=true;
                            }else{
                                b=false;
                            }
                        }while(b!=true);    
                    }
                       break;   
                case 4:
                    b=true;
                    System.out.println(" CHALLENGE 4: I I I I I I I I ...");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(x % 2 != 0){  
                                //(CONT) NUMEROS QUE SON PARES Y IMPARES
                                //Aqui se van a mostrar los pares
                                System.out.println(x + " es IMPAR");
                                b=true;
                            }else{
                                b=false;
                            }
                        }while(b!=true);    
                    }
                       break;
                case 5:
                    b=true;
                    cont=0;
                    System.out.println(" CHALLENGE 5: I P P P P P P I ...");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        cont++;
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(cont==1 || cont==limit){  
                                //(CONT) NUMEROS QUE SON INICIO Y FINAL 
                                //Aqui se van a mostrar los impares
                                
                                if(x % 2 != 0){  
                                    System.out.println(x + " es IMPAR.");
                                    b=true;
                                }else{
                                    b=false;
                                }
                            }else{
                                //(CONT) NUMEROS QUE DIFERENTES DE INICIO Y FINAL 
                                //Aqui se van a mostrar los pares
                                if(x % 2 == 0){  
                                    System.out.println(x + " es PAR.");
                                    b=true;
                                }else{
                                    b=false;
                                }
                            }
                        }while(b!=true);    
                    }
                       break; 
                case 6:
                      b=true;
                    cont=0;
                    System.out.println(" CHALLENGE 6: P I I I I I I P ... ");
                    System.out.println("Por favor, escriba el limite de random que desea genear: ");
                    limit = keyboard.nextInt();
                        
                    for(i=1;i<=limit;i++){
                        cont++;
                        do{
                            x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                            if(cont==1 || cont==limit){  
                                //(CONT) NUMEROS QUE SON INICIO Y FINAL 
                                //Aqui se van a mostrar los pares
                                
                                if(x % 2 == 0){  
                                    System.out.println(x + " es PAR.");
                                    b=true;
                                }else{
                                    b=false;
                                }
                            }else{
                                //(CONT) NUMEROS QUE DIFERENTES DE INICIO Y FINAL 
                                //Aqui se van a mostrar los impares
                                if(x % 2 != 0){  
                                    System.out.println(x + " es IMPAR.");
                                    b=true;
                                }else{
                                    b=false;
                                }
                            }
                        }while(b!=true);    
                    }
                       break; 
                case 7:
                       System.out.println("Usted ha salido. GRACIAS");
                       break;        
            }
           }while(op!=7);
  
        
        
        
        
        
        
        


    } 
}










