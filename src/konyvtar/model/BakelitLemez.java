package konyvtar.model;

import konyvtar.model.termek.AbstractTermek;

public class BakelitLemez extends AbstractTermek {

    private boolean nemKolcs = false;

    public BakelitLemez(boolean nemKolcs) {
        super();
        this.nemKolcs = nemKolcs;
    }

    public String allapot() {
        String allapot = "";
        if (nemKolcs == false) {
            allapot = "Nem kölcsönözhető";
        }
        return allapot;
    }

    @Override
    public String toString() {
        return "Állapot: " + allapot();
    }
}
