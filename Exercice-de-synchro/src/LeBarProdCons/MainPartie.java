package LeBarProdCons;

public class MainPartie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable
		Bar B =new Bar();
		Barman bob = new Barman(B);
		Buveur Francis = new Buveur(B);
		bob.start();
		Francis.start();
	}

}
