package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.println("MySQL  -> [1]");
        System.out.println("MsSQL  -> [2]");
        System.out.println("Oracle -> [3]");
        System.out.print("Veritabaninizi seciniz : ");
        int x = oku.nextInt();

        if (x == 1) {
            IDataBase my = new MySQL();
            System.out.println(my.baglan());
        } else if (x == 2) {
            IDataBase ms = new MsSQL();
            System.out.println(ms.baglan());
        } else if (x == 3) {
            IDataBase or = new Oracle();
            System.out.println(or.baglan());
        } else {
            System.out.println("Secenekler harici giris yaptiniz.");
        }
    }
}
