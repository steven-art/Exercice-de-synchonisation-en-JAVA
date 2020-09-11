package Lapeche;

public class ZonePeche {
	
	//variable 
	private  int qPoisson ;
	
	public ZonePeche(int nbPoisson) {
		this.qPoisson = nbPoisson;
	}
	
	public void pecher() {
		while( qPoisson != 50 ) {
		qPoisson--;}
	}

	public int getqPoisson() {
		return qPoisson;
	}

	
}
