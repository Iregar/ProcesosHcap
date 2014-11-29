
package hilosjava1;


//llamo a la libreria Threads
public class HilosJava1 extends Thread {

     //crearse un hilo en java

public void run() { 
 System.out.println("Hola alumnos de DAM!"); 
}
public static void main(String args[]) {
 (new HilosJava1()).start(); 
}
}