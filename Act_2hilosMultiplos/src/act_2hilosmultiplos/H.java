/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package act_2hilosmultiplos;

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
        // si el contador es resto de 5 entonces el hilo 2 muestra que es multiplo
	if (n%5==0){
            System.out.println("El hilo 2 indica que el numero:" +""+ n +""+ "es multiplo de 5");
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
        //imprimo mensaje
	           System.out.println("El hilo1 produce el numero:"+n);
	notify();     
	}

	public static void main(String[] args) {
		H h = new H(); 
		new Hilo1(h); 
		new Hilo2(h); 
                
		// Instrucciones del método 
      }
}