package Main;

import java.util.Scanner;

public class Client {
    Scanner oku = new Scanner(System.in);

    public void OdenecekMeblaHesapla(ITutarHesaplayici hesaplayici) {
        System.out.println("Lutfen fiyat giriniz.");
        double fiyat = oku.nextDouble();
        System.out.println("Lutfen adet giriniz.");
        double miktar = oku.nextDouble();
        System.out.println("Tutar =" + hesaplayici.Hesapla(fiyat, miktar));
    }
}
