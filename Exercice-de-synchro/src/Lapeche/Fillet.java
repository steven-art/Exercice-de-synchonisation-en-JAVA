package Lapeche;

public class Fillet {

	private int nbPoisson;
	private String nom;
	private ZonePeche Z;
	public Fillet(String nom, int nbPoisson) {
		this.nbPoisson = nbPoisson;
		this.nom = nom;
	}
	
	public void attraper() {
		while (nbPoisson !=10) {
		nbPoisson++;
		}
	}
	public int getNbPoisson() {
		return nbPoisson;
	}

	public void livrer() {
		while( nbPoisson != 0 ) {
		nbPoisson--;}
	}
	  public void afficher() {
	        System.out.println("Le stock " + nom + " contient " + nbPoisson + " poisson(s).");
	    }
}
