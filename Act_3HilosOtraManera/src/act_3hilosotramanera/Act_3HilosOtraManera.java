
package act_3hilosotramanera;

/**
 *Actividad crear 3 Hilos pero de otra manera
 * @author Ivan Reyes
 *
 */
public class Act_3HilosOtraManera {

    public static void main(String[] args) throws InterruptedException {
       
        //Implemento el hilo Luis y lo defino todo en el
        Thread Hilo1 = new Thread(new Runnable () {
            //implemento el metod para usar Runnable
            public void run() {
                System.out.println("Empiezo el Hilo1");
                for (int i =0; i<3; i++ ){
                     System.out.println("Comenzando por Luis" +" " +"i=" +i);
            }
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                
                    System.out.println ("Luis ha terminado");
                    }
                        });
        
        
        Thread Hilo2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Empiezo el hilo Ivan");
                for (int i =0; i<3; i++){
                    System.out.println("Comenzando por Ivan" +" " +"i=" +i);
                }try{
                    Thread.sleep(200);
                    
                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
              System.out.println ("Ivan ha terminado");
                       }
              });
        
        Thread Hilo3 = new Thread (new Runnable() {

             @Override
            public void run() {
                System.out.println("Empiezo el hilo Victor");
                for (int i =0; i<3; i++){
                    System.out.println("Comenzando por VIctor" +" " +"i=" +i);
                }try{
                    Thread.sleep(200);
                    
                }catch (InterruptedException e ){
                    e.printStackTrace();
                }
              System.out.println ("Victor ha terminado");
                       }
              });
                
        //empiezo los hilos
    Hilo1.start();
    Hilo2.start();
    Hilo3.start();
    
    }
    }
    
