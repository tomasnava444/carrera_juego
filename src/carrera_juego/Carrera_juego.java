/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_juego;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Carrera_juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String conductor;
       int km=0,carril ;
       int pos= 0;
       int opcion=1; 
       int pista;
       int jugadores;
        carrera car = new carrera();
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite el numero de jugadores ");
       jugadores=scanner.nextInt();
         
       for(int i=1 ;i<=jugadores;i++){
           System.out.print("digite el nombre del jugador    "+i +" \n");
            conductor =scanner.next();
            carril=i;
            car.alinear(conductor, carril, km,pos);
            
       }
       System.out.print("la pista tiene una distancia de 2kilometros \n ");
       pista=2000;
       
       
       
       
         while ( opcion==1)
         {
             car.iniciar_carrera(jugadores, pista);
       
       System.out.print("\n desea avanzar turno 1:si 2:no \n ");
        opcion=scanner.nextInt();
        }
         
         
       car.mostrar2();
 
    }
    
}
