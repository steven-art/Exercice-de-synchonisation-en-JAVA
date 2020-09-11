package producteurConsSarah;

public class Moniteur {
    private int nbVerres;
    private int iprod;
    private int icons;
    private int nbcaseVide;
    private int nbCasePleine;
    private int [] bar;

public Moniteur (int nverre) {
    this.nbVerres=nverre;
    bar = new int[nverre];
    iprod=0;
    icons=0;
    nbCasePleine=0;
    nbcaseVide=nverre;
}


public synchronized void consommer() {
    while(nbCasePleine==0) {
        try { wait();}
        catch(InterruptedException e) {}
    }
    int boire = bar[icons];
    icons=(icons+1)%nbVerres;
    nbCasePleine--;
    nbcaseVide++;
    notify();
    
}

public synchronized void servir() {
    while(nbcaseVide==0) {
        try { wait();}
        catch(InterruptedException e) {}
    }
    bar[iprod]=1;//1 verre servit
    iprod=(iprod+1)%nbVerres;
    nbCasePleine++;
    nbcaseVide--;
    notify();
}
}