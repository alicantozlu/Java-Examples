package Denemeler;

public class Main {

    public static void main(String[] args) {
        at_1 at = new at_1();
        at.setName("kek");
        System.out.println(at.getName());
        at_1 sam = new at_1("pasta", 5, 3);
        System.out.println("---------");
        at.kal();
        at.getKos(5,8);
        System.out.println("--------------");
        at_2 hel = new at_2();
        System.out.println(hel.kosar(4,6));
        System.out.println("-------------");
        at_3 keke = new at_3();
        at_1 hik = new at_1();
        System.out.println(keke.kosYaz(hik,3,5));
    }
}



