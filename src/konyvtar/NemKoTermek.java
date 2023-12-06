package konyvtar;

public class NemKoTermek extends AbstractTermek {

    private boolean nemKolcs = false;

    public NemKoTermek(boolean nemKolcs) {
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
