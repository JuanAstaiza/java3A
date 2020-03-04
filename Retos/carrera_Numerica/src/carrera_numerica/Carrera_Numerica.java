/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_numerica;

import java.util.Scanner;

/**
 *
 * @author JUAN CARLOS ASTAIZA
 */
public class Carrera_Numerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que permite simular el comportamiento del juego de “Carrera numérica”.
        Scanner lector=new Scanner(System.in);
           
        int op = 0, cont = 0, cant_players = 0, posicion = 0;

        
        System.out.println("JUEGO SOBRE CARRERA NUMERICA");
        System.out.println("---------------------------------");
        System.out.println("");
        while (op!=2) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("----------------------");
            System.out.println("[1] Empezar JUEGO.");
            System.out.println("[2] Salir");
            System.out.println("");
            System.out.print("Escoja una opción: ");
            op = lector.nextInt();
            switch(op){
                case 1:
                    while(op!=4){
                        System.out.println("");
                        System.out.println("EMPEZAR JUEGO ");
                        System.out.println("........................");
                        System.out.println("");
                        do{
                            if(cont>0){
                               System.out.println("Nota: ....ERROR. Número no valido.");
                            }
                            System.out.print("Digite la Cantidad de JUGADORES que desean jugar (Mínimo 2, máximo 4) : ");
                            cant_players=lector.nextInt();
                            cont++;                            
                        }while(cant_players<2  || cant_players>4 );     
                        System.out.println("NIVEL DEL JUEGO");
                        System.out.println("........................");
                        System.out.println("");
                        System.out.println("[1] Nivel básico (Tablero de 20 posiciones).");
                        System.out.println("[2] Nivel intermedio (Tablero de 30 posiciones).");
                        System.out.println("[3] Nivel avanzado (Tablero de 50 posiciones).");
                        System.out.println("[4] Salir.");
                        System.out.println("");
                        System.out.print("Escoja una opción: ");
                        op = lector.nextInt();
                        switch(op){
                            case 1:
                                   System.out.println("");
                                   System.out.println(" Nivel básico (Tablero de 20 posiciones).");
                                   System.out.print(".............................................");
                                   posicion=20;
                                   juego(cant_players,posicion);
                                   
                                break;
                            case 2:
                                   System.out.println("");
                                   System.out.println(" Nivel intermedio (Tablero de 30 posiciones).");
                                   System.out.print(".............................................");
                                   posicion=30;
                                   juego(cant_players,posicion);
                                break;
                            case 3:
                                   System.out.println("");
                                   System.out.println(" Nivel avanzado (Tablero de 50 posiciones).");
                                   System.out.print(".............................................");
                                   posicion=50;
                                   juego(cant_players,posicion);
                                break;
                            case 4: 
                                    System.out.println("");
                                    System.out.println("Usted ha salido se encuentra en el menú principal..");
                                    System.out.println("");
                            default:
                                    System.out.println("");
                                    System.out.println("Opción Incorrecta. Por favor intente nuevamente.");
                                    System.out.println("");
                                break;
                        }
                    }
                    break;
                case 2:
                        System.out.println("");
                        System.out.println("Usted ha salido del Sistema.");
                    break;
                default:
                        System.out.println("");
                        System.out.println("Opción Incorrecta. Por favor intente nuevamente.");
                    break;
                
            }
        }
    }
    
    public static int juego(int players,int posicion){
        Scanner lector=new Scanner(System.in);
        String booleano="NO";
        int intentos=0;
        int  acumulador1 = 0, acumulador2 = 0,  acumulador3 = 0, acumulador4 = 0;
        int  pares_acumulados1 = 0,  pares_acumulados2 = 0,   pares_acumulados3 = 0, pares_acumulados4 = 0;
        
        while (booleano!="SI") {            
            System.out.println("________________________________________________");
            System.out.println("INTENTOS: "+intentos);
            System.out.println("");
            for (int i = 0; i <= players; i++) {
                pares_acumulados1 = 0;
                pares_acumulados2 = 0;
                pares_acumulados3 = 0;
                pares_acumulados4 = 0;
                System.out.println("Jugador "+i+" :");
                System.out.println("Por favor presione ENTER para lanzar Primer DADO... : ");
                String entrada  = lector.nextLine();
                System.out.println(entrada);
                int dado1 = (int) (Math.random()*6+1);
                int dado2 = (int) (Math.random()*6+1);
                System.out.println("DADO 1: "+dado1);
                System.out.println("DADO 2: "+dado2);
                if(i==1){
                
                }
                
                
            }
            
        }        
        return 0;      
    }
 //FUNCION QUE PERMITE VALIDAR  Y RETORNAR EL VALOR DE LOS PARES DE DADOS
    public static int dados_pares(int d1,int d2){
        int pares_c=0;
        if (d1 == 1 && d2 == 1){
            pares_c = 1;
        }else if( d1 == d2){
            pares_c = 1;
        }else{
            pares_c = 0;
        }
        return pares_c;
    }
//
}
