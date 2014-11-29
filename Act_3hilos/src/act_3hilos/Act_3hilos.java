package act_3hilos;

/**
 *Actividad crear 3 Hilos
 * @author Ivan Reyes
 *
 */
public class Act_3hilos implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        
        //me creo los hilos
        
        Thread Hilo1 = new Thread();
        Thread Hilo2 = new Thread();
        Thread Hilo3 = new Thread();
        
         // inicio los hilos
        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        
       
        for (int i=0; i<3; i++){
         System.out.println("Comenzando por Luis" +" " +"i=" +i);
            Thread.sleep(100);
        }
     
        for (int i=0; i<3; i++){
         System.out.println("Comenzando por Ivan" +" " +"i=" +i);
            Thread.sleep(100);
        }
        
         for (int i=0; i<3; i++){
         System.out.println("Comenzando por Victor" +" " +"i=" +i);
            Thread.sleep(100);
        }
    }

     
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
   