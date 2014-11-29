package hilosjavajoin;

public class Hilosjavajoin {

public static void main(String[] args) throws InterruptedException {

Thread hilo1 = new Thread (new Runnable()
      
{

public void run() {
System.out.println ("La primera tarea ha comenzado");
System.out.println ("El Hilo1 va a dormir durante 2 segundos");
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println ("La primera tarea ha terminado");
}
});

Thread hilo2 = new Thread(new Runnable(){
public void run() {
System.out.println("La segunda tarea ha terminado");
}
});

hilo1.start();
hilo1.join(); //fuerzo a que una tarea hasta que no acabe no empiece otra
hilo2.start(); 
}
}