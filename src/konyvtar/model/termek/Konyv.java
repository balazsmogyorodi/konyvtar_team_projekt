
package konyvtar.model.termek;





public class Konyv  extends AbstractTermek implements Kolcsonozheto{
    private String cim;

    public Konyv(int id, String cim) { 
       super(id);
       this.cim = cim;
       
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim=" + cim + '}';
    }

    public String getCim() {
        return cim;
    }
    
    
    
    
    
    
    
    
    
    
}
