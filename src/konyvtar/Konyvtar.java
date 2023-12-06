
package konyvtar;

import java.util.ArrayList;
import konyvtar.model.termek.AbstractTermek;
import konyvtar.model.Kolcsonozheto;


public class Konyvtar {
    ArrayList<AbstractTermek> termekek;

    public Konyvtar() {
        this.termekek = new ArrayList<>();
    }
    
    public boolean kolcsonozheto(AbstractTermek termek) {
        return termek instanceof Kolcsonozheto;
        
    }
    
    public void felvesz(AbstractTermek termek) {
        termekek.add(termek);
    }
}
