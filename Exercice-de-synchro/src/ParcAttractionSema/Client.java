package ParcAttractionSema;
import java.util.concurrent.Semaphore;
public class Client extends Thread{
	int num;
	Semaphore sem;
	int nbplace = 3;
	public Client(int num, Semaphore sem) {
		this.num = num;
		this.sem =sem;
	}
	
	public void run() {
		try{
			sem.acquire();
			while(nbplace == 0) {
				try{wait();}
				catch(InterruptedException e) {}
				}
			nbplace--;
			System.out.println("le Client :"+num+ " fait lattraction");
			try {sleep(100);}catch(InterruptedException e) {}
			System.err.println("le Client : "+num+ " descend de attraction");
			
			sem.release();
			nbplace++;
		}catch(InterruptedException e) {}
	}
}
