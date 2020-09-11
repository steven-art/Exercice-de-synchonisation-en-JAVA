package Lapeche;


public class Port {
	private int stock;
	
	public Port(int stock) {
		this.stock =stock;
	}
	public void recuperer() {
		
		stock++;
	}
	 public void afficher() {
	        System.out.println("Le port  contient " + stock + " poisson(s).");
	    }
}
