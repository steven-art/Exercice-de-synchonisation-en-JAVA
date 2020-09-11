package Lapeche;

public class SystemeDePeche {

	ZonePeche ZP = new ZonePeche(100);
	Fillet fillet = new Fillet("f1",0);
	Fillet fillet2 =new Fillet("f2",0);
	Port port = new Port(0);
	Bateau bat1 = new Bateau(fillet, ZP, port, 50);
	Bateau bat2 = new Bateau(fillet2, ZP, port, 50);
	
	public void AllezPecher() {
		bat1.peche();
		bat2.peche();
		fillet.afficher();
		fillet2.afficher();
		while (fillet.getNbPoisson() !=0 & fillet2.getNbPoisson() != 0 ) {
		bat1.retour();
		bat2.retour();
		port.afficher();}
	}
	public static void main(String[] args) {

        SystemeDePeche u = new SystemeDePeche();
        u.AllezPecher();
    }
}
