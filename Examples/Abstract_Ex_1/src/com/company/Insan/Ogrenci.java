package com.company.Insan;

public abstract class Ogrenci {
    public abstract void konus();

    String isim;
    String numara;
    int yas;

    public void kim(String ad) {
        System.out.println("Benim adim " + ad);
    }

    public void derece() {
        System.out.println("Ben bir "+this.getClass().getSimpleName()+" ogrencisiyim.");
    }
    public Ogrenci() {
        this.isim = isim;
        this.numara = numara;
        this.yas = yas;
    }

}