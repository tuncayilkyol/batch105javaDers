package calsmaa;

public class us_sorusu_odev {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
        int sayi = 100;
        int us = 1;

        usHesapla(sayi, us);

    }

    public static void usHesapla(int sayi, int us) {
        double sonuc = 1;

        if (us < 0) {
            us *= -1;
            while (us != 0) {
                sonuc *= sayi;
                us--;
            }
            System.out.println(1 / sonuc);

        } else if (us > 0) {
            while (us != 0) {
                sonuc *= sayi;
                us--;
            }
            System.out.println(sonuc);
        } else {
            System.out.println("1");


        }
    }

}

