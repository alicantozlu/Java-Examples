package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Adapter adapter = new Adapter();
        Integer secenek = null;
        Client client = new Client();
        try {
            while (true) {
                System.out.println("Malzeme tutarini hesaplamak icin 1`e," +
                        "\nIskontolu tutarini hesaplamak icin 2 ye," +
                        "\n Uygulamadan cikmak icin 3`e basiniz.\n");
                secenek = oku.nextInt();
                if (secenek == 1) {
                    //client.OdenecekMeblaHesapla(new MalzemeTipineGoreToplamTutariHesapla());
                } else if (secenek == 2) {
                    client.OdenecekMeblaHesapla(new Adapter());
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Hata!");
        }
    }
}
