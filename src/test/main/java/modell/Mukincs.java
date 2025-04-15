package modell;

import java.util.UUID;

public class Mukincs {
    private transient UUID id;
    private String alkoto;
    private String cim;
    private Kategoria kategoria;

    public Mukincs(String alkoto, String cim, Kategoria kategoria) {
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
        this.randomIdGen();
    }

    private void randomIdGen() {
        this.id = UUID.randomUUID();

    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }
}
