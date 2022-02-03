package com.company.Insan;

import org.w3c.dom.ls.LSOutput;

public class Universite extends Ogrenci {

    @Override
    public void konus() {
        System.out.println("Ben bir " + this.getClass().getSimpleName() + " ogrencisiyim.");
    }

    @Override
    public void kim(String ad) {
        super.kim(ad);
    }

    public String sevgili(String sevgili) {
        return "Benim sevgilim "+sevgili;
    }
}
