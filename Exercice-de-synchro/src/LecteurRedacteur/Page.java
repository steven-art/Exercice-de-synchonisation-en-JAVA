package LecteurRedacteur;
import java.util.concurrent.Semaphore;

import RendezVous.Chaloupe;
public class Page {
	static final int nblecteur = 20;
	static final int red = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore mutex_all = new Semaphore(1);
		Semaphore mutex_R = new Semaphore(1);
		Semaphore mutex_nblect = new Semaphore(1);
		
		//Instanciation des Lecteur
				for(int i =0; i<nblecteur; i++) {
					Lecteur lec = new Lecteur(mutex_nblect, mutex_all, mutex_R);
					lec.start();
				}
		//Instanciation des redacteurs
				for(int i =0; i<red; i++) {
					Redacteur redac = new Redacteur( mutex_all, mutex_R);
					redac.start();
				}	
	}

}
