package sincro_hilos_act1;
public class Thread2 implements Runnable{
    private final H h;

        Thread2(H h) { 
	this.h = h; 
	new Thread(this, "Hilo2").start(); 
	} 

    @Override
    public void run() {
        
        while (true){
         h.get();
        }
        }
    }

