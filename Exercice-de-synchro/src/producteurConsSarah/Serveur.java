package producteurConsSarah;

public class Serveur extends Thread {
    private Moniteur m;
    private int pourboire=0;

    public Serveur(Moniteur m) {
        this.m=m;
    }

    public void run() {
        while(true) {
            m.servir();
            pourboire++;
            System.out.println("Vive l'alcool, j'ai remplis le verre et gagner un pourboire. J'ai "+pourboire);
        }
    }

}
