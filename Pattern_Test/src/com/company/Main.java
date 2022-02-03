package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String newDate = "28022023";

        String day = newDate.substring(0, 2);
        int i_day = Integer.parseInt(day); // 02 -> 2 | 10 -> 10
        String month = newDate.substring(2, 4);
        int i_month = Integer.parseInt(month);
        String year = newDate.substring(4, 8);
        int i_year = Integer.parseInt(year);

        int[] Aylar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] Aylar_31_Gunluk = {1, 3, 5, 7, 8, 10, 12};
        int[] Aylar_30_Gunluk = {4, 6, 9, 11};
        int subat = 2;
        int[] Subat_29 = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060}; // Subatin 29 cektigi yillar

        boolean yil_29 = false;
        if (i_month == subat) { // Eger aylardan subat ayi ise
            System.out.println("i_month : " + i_month + " | Subat : " + subat);
            System.out.println("------------------------------");
            for (int j : Subat_29) { // Subatin 29 cektigi yillar
                System.out.println("j : " + j + " | Subat_29 : " + Arrays.toString(Subat_29));
                if (i_year == j) { // Evet Subat 29 Cekiyor
                    yil_29 = true;
                    break;
                } else {
                    yil_29 = false;
                }
            }

            if (yil_29) { // Evet Subat 29 Cekiyor
                System.out.println("------------------------------");
                System.out.println("i_year : " + i_year + " | tarih : " + Arrays.toString(Subat_29));
                System.out.println("i_day : " + i_day);
                if (i_day <= 0 || i_day >= 30) { // gun 0'a esit veya kucuk olamaz, veya 30'a esit ve buyuk olamaz
                    System.out.println("Hata! = Subat 29 cekiyor");
                } else {
                    System.out.println("Şubat 29 cekiyor, tarih hatası yok.");
                }
            } else { // Hayir subat 29 cekmiyor
                System.out.println("------------------------------");
                System.out.println("i_year : " + i_year + " | tarih : " + Arrays.toString(Subat_29));
                System.out.println("i_day : " + i_day);
                if (i_day <= 0 || i_day >= 29) { // gun 0'a esit veya kucuk olamaz, veya 29'a esit ve buyuk olamaz
                    System.out.println("Hata! = Subat 28 cekiyor");
                } else {
                    System.out.println("Şubat 28 cekiyor, tarih hatası yok.");
                }
            }
        }



    }
}