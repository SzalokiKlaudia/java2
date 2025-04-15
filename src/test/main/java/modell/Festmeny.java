package modell;

public class Festmeny extends Mukincs {
    private final String stilus;
    private final String technika;


    public Festmeny(String alkoto, String cim, Kategoria kategoria, String stilus, String technika) {
        super(alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getStilus() {
        return stilus;
    }

    public String getTechnika() {
        return technika;
    }


}
