package abc;

class VergiHesapla {
//Aşağıdaki örnek, bileşenlerle işlem yapılabileceğini göstermektedir.
// Aylık ücretler ve gelir vergileri iki ayrı array ile tutulmakta,
// bir döngü ile %30 gelir vergisi hesaplanıp konsola yazılmaktadır.

    public static void main(String[] args) {
        double[] aylikUcret = new double[3];
        aylikUcret[0] = 2782.45;
        aylikUcret[1] = 9346.74;
        aylikUcret[2] = 10867.83;
        double[] gelirVergisi = new double[3];
        for (int i = 0; i < aylikUcret.length; i++) {
            gelirVergisi[i] = aylikUcret[i] * 30 / 100;
            System.out.println("Aylık " + aylikUcret[i] + " TL ücretin gelir vergisi = " + gelirVergisi[i]);

            //ekran cıktisi.................

            //Aylık 2782.45 TL ücretin gelir vergisi = 834.735
            //Aylık 9346.74 TL ücretin gelir vergisi = 2804.022
            //Aylık 10867.83 TL ücretin gelir vergisi = 3260.349
        }
    }
}
