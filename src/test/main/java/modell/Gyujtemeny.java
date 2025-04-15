package modell;

import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny {
    private List<Mukincs> szobrok_festmenyek;
    //private List<Mukincs> festmenyek;

    public Gyujtemeny() {
        this.szobrok_festmenyek = new ArrayList<>();
        //this.festmenyek = new ArrayList<>();
    }

    /*public List<Mukincs> getSzobrok() {
        return new ArrayList<>(this.szobrok);

    }*/

    public List<Mukincs> getSzobrok_festmenyek() {
        return new ArrayList<>(this.szobrok_festmenyek);
    }

    public List<Mukincs> felveszMutargyat(Mukincs mukincs){
        szobrok_festmenyek.add(mukincs);
        return szobrok_festmenyek;


    }




}
