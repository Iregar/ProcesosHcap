package sincro_hilos_act2;

import java.util.ArrayList;

/**
 *Escribe un programa en el que haya 3 hilos insertando elementos en un array llamado múltiplos y otro hilo que imprime los 
 * contenidos de dicho array de modo que el programa no presente problemas de concurrencia.
El primer hilo introduce números del 1 al 110 que sean múltiplos de 11.
El segundo hilo introduce números del 1 al 30 que sean múltiplos de 3.
El tercer hilo introduce números del 1 al 70 que sean múltiplos de 7.
Se mostrarán por consola los valores introducidos en el array 
 * 
 */

public class Metodos implements Runnable{
    
 //Me cro el array para recoger los valores
    
ArrayList<String> numeros = new ArrayList<String>();
    
 // me creo los hilos y los instancio
        Thread m11= new Thread();
        Thread m3= new Thread();
        Thread m7 =new Thread();
//llamo al metodo run
    public void run() {
        
       //Arranco el primer hilo
        m11.start();
        
        for (int a =0; a<110; a++){
            if (a%11==0){
                numeros.add(a +" "+ "es multiplo de 11 \n");
            }//cierro el if de m11
        } //cierro for de m11
          try {
        m11.join();
        m3.start();
        for (int a =0; a<=30; a++){
            if (a%3==0){
                numeros.add(a + " "+ "es multiplo de 3 \n");
                 } //cierro el if de m3
               }//cierro for m3
                m3.join();
                m7.start();
            
       for (int a =0; a<=70; a++){
            if (a%7==0){
                numeros.add(a + " " +"es multiplo de 7 \n");
             } //cierro el if m7
            }//cierro for m7
               m7.join();
          
       
    } catch (InterruptedException ex) {
       ex.printStackTrace();
    }
    }

    void mostar() {
       System.out.println(numeros);
    }
   
}//cierro clase

