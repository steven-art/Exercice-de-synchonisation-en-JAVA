package Lapeche;

public class Bateau {

	private Fillet f1;
	private ZonePeche p1;
	private Port T1;
	private int ndPoissonADeposer;
	
	public Bateau(Fillet f1 ,ZonePeche p1,Port T1, int ndPoissonADeposer) {
		this.f1 = f1;
		this.p1 =p1;
		this.T1 = T1;
		this.ndPoissonADeposer = ndPoissonADeposer;
	}
	
	public void peche() {
		f1.attraper();
		p1.pecher();
		
	
	}
	
	public void retour() {
		try { Thread.sleep(100); } catch(InterruptedException e) {}
		f1.livrer();
		T1.recuperer();
	}
}
