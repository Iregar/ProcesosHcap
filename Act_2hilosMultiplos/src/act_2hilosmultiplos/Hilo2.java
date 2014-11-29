package act_2hilosmultiplos;

/**
 *
 * @author uemuser
 */
public class Hilo2 implements Runnable{


	H h; 
	
      Hilo2(H h) { 
	this.h = h; 
	new Thread(this, "Hilo2").start(); 
	} 

	public void run() { 
         while (true) {
                h.get();
            }
}
	} 


