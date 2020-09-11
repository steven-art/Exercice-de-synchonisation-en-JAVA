package LeBarProdCons;

public class Buveur extends Thread{
	Bar B;
	private int monnaie = 10;
	private int verreVide = 0;
	public Buveur(Bar B) {
		this.B = B;
	}
	public void run() {
		while(monnaie != 0) {
			int val = verreVide;
			B.avcons();
			B.consommer(val);
			System.out.println("Encore");
			try {sleep(10);}catch(InterruptedException e) {}
			B.apcons();
			monnaie = monnaie-2;
		}
		System.out.println("Plus de sous !!");
	}
}
