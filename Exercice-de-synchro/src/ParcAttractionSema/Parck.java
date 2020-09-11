package ParcAttractionSema;
import java.util.Random;

import java.util.concurrent.Semaphore;
public class Parck {
	//nombre de client
	static final int nbClient = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(3);

		//Instanciation des clients
		Client[] cli = new Client[nbClient];

		Random r = new Random(); //pour la selection des sites de depart et d'arrivee

		for(int i=0;i< nbClient;i++)
		{

			int d = r.nextInt(nbClient);



			cli[i] = new Client(d, sem);
			cli[i].start();
		}

	}

}
