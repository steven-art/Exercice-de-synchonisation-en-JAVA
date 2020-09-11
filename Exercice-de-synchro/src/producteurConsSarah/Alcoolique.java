package producteurConsSarah;

public class Alcoolique extends Thread {
    private Moniteur m;
    private int argent;

    public Alcoolique(Moniteur m, int argent) {
        this.m=m;
        this.argent=argent;
    }

    public void run() {
        while (argent>0) {
            System.out.println("Hiips Je bois un verre");
            m.consommer();
            argent--;
            System.out.println("Hiips il me reste" + argent);
        }
    }

}