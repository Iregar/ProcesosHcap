
package hilosjavapingpong;

//otra manera de crear hilos es usar Runnable que es mejor pq solo se puede ser extend de una clase y
//Runnable se implementa no es una clase heredada


 class PingPONG implements Runnable{

    
  private  String palabra;
    PingPONG (String texto){
        palabra=texto;
        
    }
    
    public void run (){
        try{
        for (int i=0; i<15; i++){
            System.out.println(palabra+" ");
            Thread.sleep(100);
        }
    }
       catch(InterruptedException e){
           return;
       } 
    }
    
    public static void main(String[] args) {
        Runnable ping = new PingPONG("ping");
        Runnable PONG = new PingPONG ("PONG");
        new Thread(ping).start();
        new Thread(PONG).start();
    } 
    
}
