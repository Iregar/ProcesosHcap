package multiplo5;

public class Multiplo5 implements Runnable{

String param;

Multiplo5(String n) {
param = n;
}

public void run(){

int i = 1;

while(i<=100){

if (param=="1") {
System.out.println("Mensaje del hilo"+param+"::: " + i);
} else {

if (i%5==0) {
System.out.println("Mensaje del hilo"+param+"::: " + "El número "+i+" es múltiplo de 5");
}
}
i = i+1;
Thread.yield();
}
}

public static void main(String[] args) {

Multiplo5 h1 = new Multiplo5("1");
Multiplo5 h2 = new Multiplo5("2");

Thread hilo1 = new Thread (h1);
Thread hilo2 = new Thread (h2);

hilo1.start();
hilo2.start();
}
}