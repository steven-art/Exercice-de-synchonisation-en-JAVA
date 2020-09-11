package AttractionJAVA;
//moniteur JAVA qui permet au enfant de monter et decendre de l attraction
public class MondeMagic {
	static final int placeMax = 3;
	private int nbPlace;

	public MondeMagic() {
		this.nbPlace = placeMax;
	}

	public synchronized void monte() {
		while(getnbPlace() == 0) 
		{//on met while car si un enfant arrive au moment ou je suis reveiller et me passe devant je doit refaire le test
			try{wait();} catch(InterruptedException e) {}

		}
		System.out.println("je suis monte ");
		nbPlace--;
		System.out.println("nombre de place "+ getnbPlace());
	}


	public synchronized void descendre() {
		nbPlace ++;
		System.out.println("je suis tombe ");
		System.out.println("nombre de place "+ getnbPlace());
		notify();//car on a qu'une variable d'état avec un moniteur
	}
	
	public int getnbPlace() {
		return nbPlace;
	}
	
}
