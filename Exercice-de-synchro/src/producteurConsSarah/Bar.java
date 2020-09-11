package producteurConsSarah;

public class Bar {
    private static final int nbVerre = 5;

    public static void main(String[] args) {


        Moniteur m=new Moniteur(nbVerre);
        Alcoolique alcoolique1= new Alcoolique(m,10);
        Serveur serveur1 = new Serveur(m);
        alcoolique1.start();
        serveur1.setDaemon(true);
        serveur1.start();
    }

}