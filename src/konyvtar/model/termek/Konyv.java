
package konyvtar.model.termek;

import konyvtar.model.Kolcsonozheto;





public class Konyv  extends AbstractTermek implements Kolcsonozheto{
    private String cim;

    public Konyv(String cim) { 
       super();
       this.cim = cim;
       
    }

    @Override
    public String toString() {
        String txt = "";
        txt += super.toString() + " ";
        txt += "Konyv{" + "cim=" + cim + '}';
        return txt;
    }

    public String getCim() {
        return cim;
    }
    
    
    
    
    
    
    
    
    
    
}
