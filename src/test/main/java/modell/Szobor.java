package modell;

import java.text.Collator;
import java.util.Comparator;

public class Szobor extends Mukincs implements Comparable<Szobor>{
    private String anyaga;
    private int mikorKeszult;

    public Szobor(String anyaga, int mikorKeszult) throws SajatKivetel {

        if(mikorKeszult > 21){
            throw new SajatKivetel("Nagyobb mint 21");

        }else{
            super();
            this.anyaga = anyaga;
            this.mikorKeszult = 20;

        }


    }

    public String getAnyaga() {
        return anyaga;
    }

    public int getMikorKeszult() {
        return mikorKeszult;
    }

    @Override
    public int compareTo(Szobor masik) {
        Collator col = Collator.getInstance();
        return col.compare(this.getAlkoto(),masik.getAlkoto());
    }

    private static class AlkotoComparator implements Comparator<Szobor>{

        public AlkotoComparator() {
        }

        public int compare (Szobor egyik, Szobor masik){
            Collator col = Collator.getInstance();
            return col.compare(egyik.getAlkoto(),masik.getAlkoto());
        }
    }

    private static class SzazadComparator implements Comparator<Szobor>{

        public SzazadComparator() {
        }

        public int compare (Szobor egyik, Szobor masik){
            return egyik.mikorKeszult - masik.mikorKeszult;
        }
    }

    private static class AnyagComparator implements  Comparator<Szobor>{

        public AnyagComparator() {
        }

        public int compare (Szobor egyik, Szobor masik){
            Collator col = Collator.getInstance();
            return col.compare(egyik.anyaga, masik.anyaga);
        }
    }
}
