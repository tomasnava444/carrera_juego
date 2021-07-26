/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_juego;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
public class carrera {
    
     Nodo cabeza;
    Nodo cabeza2;
    public carrera() {
        cabeza = null;
        cabeza2=null;
    }

  

   
    public void alinear (String conductor,int carril,int km,int pos){
        Nodo nuevo = new Nodo();
        nuevo.setCarril(carril);
       nuevo.setConductor(conductor);
        nuevo.setKm(km);
       nuevo.setLiga(null);
        nuevo.setPos(pos);
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo ultimo = getUltimo();
            ultimo.setLiga(nuevo);
        }
         
    }
      public Nodo getUltimo(){
        if(cabeza == null){
            return cabeza;
        }
        
        Nodo nodoActual = cabeza;
        
        while(nodoActual.getLiga() != null){
            nodoActual = nodoActual.getLiga();
        }
        
        return nodoActual;
    }
        public Nodo getUltimo2(){
        if(cabeza2 == null){
            return cabeza2;
        }
        
        Nodo nodoActual = cabeza2;
        
        while(nodoActual.getLiga() != null){
            nodoActual = nodoActual.getLiga();
        }
        
        return nodoActual;
    }
      
      public void mostrar(){
          
          Nodo p ;
          p = cabeza ; 
          while (p!=null){
              System.out.print("nombre  " + p.getConductor()+ "     carril    " + p.getCarril() + "   Km    "+ p.getKm()+"\n");
              
              p=p.getLiga();
  
          }
          
      }
      
      public void iniciar_carrera (int com,int tam){
          Nodo p= cabeza;
          int Dados;
          int aleatorio;
        //  int s=0,sw2=0,sw3=0,sw4=0;
          aleatorio = (int) (Math.random() * com) + 1;
          while (p!=null){
            
              if(p.getCarril()== aleatorio && p.getKm()<tam){
                    Dados = (int) (Math.random() * 6) + 1;
                    p.setKm((Dados*100)+p.getKm());
                    System.out.print("    El carro de:  " + p.getConductor()+ "  avanzo  "+ Dados*100+ "   metros     ");
                    System.out.print("    lleva recorrido en total "+ p.getKm()+ " \n\n ");
              }
           
              if(p.getKm()>=tam  && p.getPos()==0 ){
                 
                    System.out.print("    El carro de:  " + p.getConductor()+ "  llego a la meta  "+  "  \n  ");
                     p.setPos(1);
                 insertar(p.getConductor());
          
               
             
          }
           p= p.getLiga();
      } 
      
      }
      public void podio(String conductores){
          
         carrera nuevo =new carrera();
         nuevo.insertar(conductores);
         nuevo.mostrar2();
      }
       public void insertar (String conductor){
        Nodo nuevo = new Nodo();
       
       nuevo.setConductor(conductor);
      
        if(cabeza2 == null){
            cabeza2 = nuevo;
        }else{
            Nodo ultimo = getUltimo2();
            ultimo.setLiga(nuevo);
        }
         
    }
       public void mostrar2(){
          
          Nodo p ;
          int i=1;
          p = cabeza2 ; 
          
          while (p!=null&& i <=3){
             
              System.out.print(i + p.getConductor()+ "\n");
               i++;
          File mi_archivo;
          PrintWriter escribir;
          mi_archivo=new File("podio.txt");
                
          if(!mi_archivo.exists()){
              try {
                  mi_archivo.createNewFile(); 
              } catch(IOException e){
               }   
              }else{
                   
                       try {
                            escribir =new PrintWriter(mi_archivo,"utf-8");
                            escribir.print(p.getConductor()+"1");
                            escribir.close();
                       } catch (FileNotFoundException | UnsupportedEncodingException e) {
                       }
                       
                        }
                         p=p.getLiga();
                     }
               
               
           
  
          }
}
