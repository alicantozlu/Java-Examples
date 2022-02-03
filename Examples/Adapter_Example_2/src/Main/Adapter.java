package Main;

public class Adapter implements ITutarHesaplayici {
    //Adapter sinifi icerisinde adaptee sinifinin bit nesnesi bulunur.
    private Adaptee ish;

    public Adapter() {
        ish = new Adaptee();
    }
    @Override
    public double Hesapla(double fiyat, double adet) {
        return ish.iskontoHesapla(fiyat, adet);
    }
}
