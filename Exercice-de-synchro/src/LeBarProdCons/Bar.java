package LeBarProdCons;

public class Bar {

	private static final int n = 10;
	private int LigneVerre[];
	private int iprod;
	private int icons;
	private int nbVide;
	private int nbPlein;
	
	public Bar() {
		LigneVerre = new int[n];
		this.iprod = 0;
		this.icons =0;
		this.nbPlein =0;
		this.nbVide =n;
		
	}
	public synchronized void avprod(){
		if(nbVide == 0) {
			try {wait();}catch(InterruptedException e) {}
		}else {
			nbVide -- ;
		
		}
	}
	public void produire(int val) {
		// TODO Auto-generated method stub
		LigneVerre[iprod] = val;
	}
	
	public synchronized void approd() {
		nbPlein ++;
		notify();
		iprod = (iprod +1)%n;
	}
	public synchronized void avcons(){
		if(nbPlein == 0) {
			try {wait();}catch(InterruptedException e) {}
		}else {
			nbPlein -- ;
		
		}
	}
	public void consommer(int val) {
		// TODO Auto-generated method stub
		LigneVerre[icons] = val;
	}
	public synchronized void apcons() {
		nbVide ++;
		notify();
		icons = (icons +1)%n;
	}
}
