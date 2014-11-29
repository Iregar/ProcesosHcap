package sincro_hilos_act2;
/**
 *Escribe un programa en el que haya 3 hilos insertando elementos en un array llamado múltiplos y otro hilo que imprime los 
 * contenidos de dicho array de modo que el programa no presente problemas de concurrencia.
El primer hilo intr%oduce números del 1 al 110 que sean múltiplos de 11.
El segundo hilo introduce números del 1 al 30 que sean múltiplos de 3.
El tercer hilo introduce números del 1 al 70 que sean múltiplos de 7.
Se mostrarán por consola los valores introducidos en el array 
 * 
 */
public class Principal{
    
 public static void main(String[] args)  {
    
     //MisPruebas test = new MisPruebas();
       // test.mostarrr();
     
    	Metodos ejercicio = new Metodos();
        ejercicio.run();
        ejercicio.mostar(); 
 
    }
 
}