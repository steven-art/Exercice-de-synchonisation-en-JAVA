package LeBarProdCons;

public class Barman extends Thread  {
private Bar B;
private int verrePlein =1;
public Barman(Bar B) {
	this.B = B;
	
}
public void run() {
	while(true) {
		int val = verrePlein;
		B.avprod();
		B.produire(val);
		System.out.println("je te sert !!");
		try {sleep(10);}catch(InterruptedException e) {}
		B.approd();
	}
}
}
