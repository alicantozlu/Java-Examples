public class Main {

    public static void main(String[] args) {
        At a1 = new At();

        System.out.println("Tur :" + a1.getTur());
        System.out.println("Isim :" + a1.getName());
        System.out.println("Direnc :" + a1.getDirenc());
        System.out.println("Hiz :" + a1.getHiz() + "\n");

        a1.Kos();
        a1.Atla();
        a1.Depar();
        a1.Atla();
        a1.Atla();
        a1.Yavasla();
        a1.Atla();
        a1.Dur();

        a1.SonDurum();

        System.out.println("---------------------------");

        Esek e1 = new Esek();

        System.out.println("Tur "+e1.getTur());
        System.out.println("Isim :" + e1.getName());
        System.out.println("Direnc :" + e1.getDirenc());
        System.out.println("Hiz :" + e1.getHiz() + "\n");

        e1.Anir();
        e1.Ciftele();
        e1.Yuru();

        e1.sonDurum();

        System.out.println("---------------------------");

        IAt_Hareketler e3 = new EsekAdapter();

        e3.Kos();
        e3.Kos();
        e3.Atla();
        e3.Yavasla();
        e3.Depar();
        e3.Atla();
        e3.Kos();
        e3.Dur();

        e3.SonDurum();
    }
}
