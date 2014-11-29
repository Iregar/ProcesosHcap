package hilosjava1;

//otra manera de crearse un hilo en java
public class MiHilo implements Runnable {
    public void run (){
        //System.out.println("Hola alumnos de DAM!"); 
        System.out.println("Ejecuto el segundo caso de crear hilos"); 
    }
    public static void main(String args[]) {
 (new Thread(new MiHilo())).start(); 
} 

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    

