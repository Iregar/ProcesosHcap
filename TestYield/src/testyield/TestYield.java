
//en este proyecto crea tres clases Mian, Productor y Consumidor
package testyield;

public class TestYield {

    public static void main(String[] args) {
    Thread productor = new Productor ();
    Thread consumidor = new Consumidor ();
    productor.start();
      consumidor.start();
        
    }
}
    class Productor extends Thread{
        public void  run (){
            for (int i=0; i<5; i++){
                System.out.println("Ping");
                Thread.yield(); //cede la ejecucion a otro hilo para que se vayan alternando los hilos
            }
        }
    }     
         class Consumidor extends Thread{
        public void  run (){
            for (int i=0; i<5; i++){
                System.out.println("Pong");
                Thread.yield(); //cede la ejecucion a otro hilo
            }
        }
        
     }

