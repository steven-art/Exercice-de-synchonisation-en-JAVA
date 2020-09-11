package AttractionJAVA;
/**
 * Classe enfant qui permet de monter et decendre de l attraction
 * @author steven TANGUY
 *
 */
public class Enfant extends Thread{
	/**
	 * chaque enfant a un code barre pour l identifie
	 */
	private int codebarre;
	
	private MondeMagic Mg ;
	/**
	 * permet de donner une durre pour l attraction
	 */
	static final int dureeAttraction = 100; 

	public Enfant(int code) {
		this.codebarre = code;
	}
	public void run() {
		
		Mg.monte();
		try{sleep(dureeAttraction);
		} catch(InterruptedException e) {}
		Mg.descendre();
	}

}

