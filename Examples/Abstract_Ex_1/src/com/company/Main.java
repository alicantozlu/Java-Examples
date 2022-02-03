package com.company;

import com.company.Insan.*;

public class Main {

    public static void main(String[] args) {
        Ogrenci a1 = new Orta_Okul();
        Ogrenci a2 = new Ilkokul();
        Ogrenci a3 = new Hazirlik();
        Ogrenci a4 = new Universite();

        a1.kim("Can");
        a1.derece();
    }
}
