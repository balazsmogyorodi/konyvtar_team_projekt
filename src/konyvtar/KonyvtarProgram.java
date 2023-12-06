
package konyvtar;

import konyvtar.model.NemKoTermek;
import konyvtar.model.termek.Konyv;


public class KonyvtarProgram {


    public static void main(String[] args) {
       new KonyvtarProgram().run();
    }

    public void run() {        
        Konyvtar konyvtar = new Konyvtar();
        
        Konyv konyv = new Konyv("Harry Potter");
        NemKoTermek termek = new NemKoTermek(false);
        konyvtar.felvesz(termek);
        konyvtar.felvesz(konyv);
        System.out.println(konyvtar.termekek);
        System.out.println(konyvtar.kolcsonozheto(konyv));
        System.out.println(konyvtar.kolcsonozheto(termek));
        
    }
    
}
