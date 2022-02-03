package com.company.Kus;

public class Kus {
    private String ad;
    private int yas;
    private String renk;
    private int yukseklik = 0;

    public Kus() {
    }

    public Kus(String ad, int yas, String renk) {
        this.ad = ad;
        this.yas = yas;
        this.renk = renk;
    }

    public String toString() {
        return "Ben bir kusum";
    }

    public void yukariuc(int yukari) {
        this.yukseklik += yukari;
    }

    public void asagiuc(int asagi) {
        this.yukseklik -= asagi;
    }


}
