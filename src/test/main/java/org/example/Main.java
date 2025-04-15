package org.example;


import modell.Gyujtemeny;
import modell.Kategoria;
import modell.Mukincs;

public class Main implements Serializable {

    public Main() {
        konzolraIr();
        fajlbalr();
        statisztika();
    }

    private void konzolraIr() {

        Mukincs mukincs1 = new Mukincs("mukincs1","mukincs1Cím", Kategoria.EREDETI);
        Mukincs mukincs2 = new Mukincs("mukincs2","mukincs2Cím", Kategoria.KIS_ERTEKU);
        Mukincs mukincs3 = new Mukincs("mukincs3","mukincs3Cím", Kategoria.MASOLAT);

        Gyujtemeny gyujti1 = new Gyujtemeny();
        gyujti1.felveszMutargyat(mukincs1);
        gyujti1.felveszMutargyat(mukincs2);
        gyujti1.felveszMutargyat(mukincs3);


    }

    public void fajlbalr(){
        try{
            try(ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("gyujt1.dat"))){
                Gyujtemeny gyujti1 = (Gyujtemeny) objBe.readObject();

                System.out.println("szeretném beolvasni...");

                for(Media media : gyujt1){
                    System.out.println(media);
                }

            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Main();

    }




}