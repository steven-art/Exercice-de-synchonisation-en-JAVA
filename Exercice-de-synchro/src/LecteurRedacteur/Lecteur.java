package LecteurRedacteur;
import java.util.Random;
import java.util.concurrent.Semaphore;
public class Lecteur extends Thread {
	Semaphore mutex_nblect;
	Semaphore mutex_all;
	Semaphore mutex_R;
	private  int cpt_nblect = 0;


	public Lecteur(Semaphore mutex_nblect,Semaphore mutex_all,Semaphore mutex_R) {
		this.mutex_all = mutex_all;
		this.mutex_nblect = mutex_nblect;
		this.mutex_R = mutex_R;
	}
	public void run() {
		try{
			mutex_all.acquire();
			mutex_nblect.acquire();
			cpt_nblect ++;
			if(cpt_nblect == 1) {
				mutex_R.acquire();
			}
			mutex_all.release();
			try{sleep(10);
			} catch(InterruptedException e) {}
			System.out.println("je lis");
			mutex_nblect.release();

			cpt_nblect--;
			if(cpt_nblect ==0) {
				mutex_R.release();
			}
			mutex_nblect.release();
		}catch(InterruptedException e) {}
	}
}

