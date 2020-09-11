package AttractionJAVA;

import java.util.Random;

import ParcAttractionSema.Client;

public class Parc {
	static final int enfants = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciation des clients
		Enfant[] enf = new Enfant[enfants];

		Random r = new Random(); //pour la selection des sites de depart et d'arrivee

		for(int i=0;i< enfants;i++)
		{

			int d = r.nextInt(enfants);
			


			enf[i] = new Enfant(d);
			enf[i].start();
		}

	}
	}


