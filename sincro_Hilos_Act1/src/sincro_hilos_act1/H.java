/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sincro_hilos_act1;

public class H {

	int n;
	boolean valueSet = false;

	synchronized int get() {
	if(!valueSet)
	    try {
                
	    wait();
	    } catch (InterruptedException e) {
	    System.out.println("InterruptedException caught");
	    }
        // si el contador es impar, entonces el hilo 2 muestra que es los numeros impares
	if (n%2!=0){
             System.out.println("El hilo2::"+""+n);
        }
	valueSet = false; 
	notify(); 
	return n; 
	} 

        //debe de mostrar los numeros del hilo1
	synchronized void put(int n) { 
	if(valueSet) 
	try { 
	wait(); 
	} catch(InterruptedException e) { 
	System.out.println("InterruptedException caught"); 
	} 
	this.n = n; 
	valueSet = true; 
       // // si el contador es par, entonces el hilo 1 muestra los numeros pares
       if (n%2==0){
	           System.out.println("El hilo1::"+""+n);
       }
	notify();     
	}

	public static void main(String[] args) {
		H h = new H(); 
		new Thread1(h); 
		new Thread2(h); 
                
		// Instrucciones del método 
      }
}