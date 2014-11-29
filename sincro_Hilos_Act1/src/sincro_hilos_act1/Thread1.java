package sincro_hilos_act1;

/**
 *Crea un programa en java que implemente el método de sincronización de hilos Productor - Consumidor.
  Se puede implementar el sistema de cola sincronizada para su resolución.
  Se tienen que mostrar todos los números del 0 al 100 de la manera siguiente:
   hilo1::   0
   hilo2::   1
   hilo1::   2
   hilo2::   3 
   */
 
public class Thread1 implements Runnable{
    
//me creo una variable de la clase H
    H h;
    
    //me creo un HIlo1 al que le voy a sincronizar con la clase H
    Thread1 (H h) {
    this.h = h;
    new Thread(this, "Hilo1").start();
    }

    public void run() {
        int a=0;
        while (true){
            while (a<=100){
            h.put(a);
            a++;
            }
    }
   }
}
