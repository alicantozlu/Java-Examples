package Main;

import java.util.Scanner;

public class Adaptee {

    Scanner oku = new Scanner(System.in);

    public double iskontoHesapla(double fiyat, double adet) {
        System.out.print("Iskonto miktari giriniz :");
        double iskonto = oku.nextDouble();
        return fiyat * adet * (1 - iskonto);
    }
}
