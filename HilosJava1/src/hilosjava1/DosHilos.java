/*
 * Estoy haciendo un programa que arrancara dos HILO
 */
package hilosjava1;

// vamos a crear dos hilos para imprimir mensajes diferentes

public class DosHilos  extends Thread{

    String cadena;
    
    //constructor 
    private DosHilos(String c) {
        cadena = c;
    }
    
    //metodo para llamar a imprimir la cadema
    public void run (){
    System.out.println(cadena);
    }
    
public static void main (String [] args ){
    //me creo los hilos 
        DosHilos hilo1 = new DosHilos("yo soy el hilo 1");
        DosHilos hilo2 = new DosHilos("yo soy el hilo 2");
        DosHilos hilo3 = new DosHilos("yo soy el hilo 3");
       
        //con el setPriority marco las prioridades de ejecución de los hilos
        hilo1.setPriority(Thread.NORM_PRIORITY);
        hilo2.setPriority(Thread.MIN_PRIORITY);
        hilo3.setPriority(Thread.MAX_PRIORITY);
        
        // inicio los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    } 

}


