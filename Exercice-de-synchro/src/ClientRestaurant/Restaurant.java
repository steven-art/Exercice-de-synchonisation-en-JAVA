package ClientRestaurant;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Restaurant {
   public static void main(String[] args) {
      //Bon, c'est un restaurant à 5 places...
      //C'est petit, mais en Bretagne, il y en a. ;)
      Semaphore sem = new Semaphore(5);
      
      ExecutorService execute = Executors.newCachedThreadPool();
      
      int i = 0;
      while(true){         
         Client cli = new Client("Client N°" + (++i), sem);
         execute.execute(cli);
         
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
