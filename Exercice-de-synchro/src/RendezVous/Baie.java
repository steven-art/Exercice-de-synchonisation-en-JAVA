package RendezVous;

import java.util.concurrent.Semaphore;

public class Baie {

	static final int  n =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore att = new Semaphore(0);//sem d'attente
		Semaphore mutex = new Semaphore(1);//sem d'exclusion mutelle

		//Instanciation des Chaloupes
		for(int i =0; i<n; i++) {
			Chaloupe cha = new Chaloupe(i, att, mutex);
			cha.start();
		}
	}

}
