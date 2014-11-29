package act_2hilosmultiplos;
public class Hilo1 implements Runnable{
    
    int resto=0;
    H h;

    Hilo1 (H h) {
    this.h = h;
    new Thread(this, "Hilo1").start();
    }

    public void run() {
	int i = 1;
                while(true) {
            while (i<=100) {
            h.put(i);
                i = i+1;
                    }
               }
        }
    }
    
    

