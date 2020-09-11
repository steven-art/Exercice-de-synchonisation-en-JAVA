package LecteurRedacteur;

import java.util.concurrent.Semaphore;

public class Redacteur extends Thread{
	Semaphore mutex_all;
	Semaphore mutex_R;
	
	public Redacteur(Semaphore mutex_all,Semaphore mutex_R) {
		this.mutex_all = mutex_all;
		this.mutex_R = mutex_R;
	}
	
	public void run() {
		try {
			mutex_all.acquire();
			mutex_R.acquire();
			System.out.println("j ecrit");
			try{sleep(10);
			} catch(InterruptedException e) {}
			mutex_R.release();
			mutex_all.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
