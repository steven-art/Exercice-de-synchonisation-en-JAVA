package RendezVous;
import java.util.Random;
import java.util.concurrent.Semaphore;
public class Chaloupe extends Thread {
	int num;
	private int nbChaloupeArrive = 0;
	Semaphore att;
	Semaphore mutex;
	private int  n = 5;

	public Chaloupe(int num, Semaphore att, Semaphore mutex) {
		this.num = num;
		this.att = att;
		this.mutex =mutex;
		
	}

	public void run() {
		try {
			mutex.acquire();
			
			nbChaloupeArrive ++;
			if (nbChaloupeArrive != n) {
				mutex.release();
				System.out.println("je suis arriver");
				att.acquire();
				

			}else if (nbChaloupeArrive == n){ 
				mutex.release();
				for(int i=0 ; i< n-1 ; i++) {
					System.out.println("on va manger");
					att.release();
					
				}

			}

		}catch(InterruptedException e) {}
	}


}
