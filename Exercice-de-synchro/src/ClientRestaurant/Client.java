package ClientRestaurant;


import java.util.Random;
import java.util.concurrent.Semaphore;

public class Client implements Runnable {

   String name;
   Semaphore sem;
   
   public Client(String pName, Semaphore pSem){
      name = pName;
      sem = pSem;
   }
   
   public void run() {
      try {
         //Nous prenons une r�servation de ressource
         sem.acquire();
         
         Random rand = new Random();
         
         //Pour avoir une pause cons�quente et bien
         //et bien voir le m�canisme du s�maphore.
         long pause = 0;
         while(pause < 8000)pause = rand.nextInt(15000);
         
         System.out.println(name + " : Je mange au restaurant pendant " + pause/1000 + " secondes");
         
         Thread.sleep(pause);
         
         System.err.println(name + " : Au revoir. Je quitte le restaurant. ");
         
         //Pour lib�rer la ressource
         sem.release();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}
