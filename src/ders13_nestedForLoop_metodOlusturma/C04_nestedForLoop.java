package ders13_nestedForLoop_metodOlusturma;

public class C04_nestedForLoop {
    public static void main(String[] args) {

         /*
        Asagidaki sekli yazdiran bir kod hazirlayin
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // ic loop bitince alt satira gec
        }
        //alternatif (benim)

        // for (int i=1 ; i<=2 ;i++){
        // for (int j = 1; j <=2 ; j++) {
        // System.out.println("* * * * * * ");

            /*
            soru
           1
          2 2
         3 3 3
        4 4 4 4
         */
        for (int i = 1; i <= 4; i++) {// satir sayisi
            for (int j = 0; j < (4 - i); j++) { // i kadar i ye bosluk birakiyor
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { // i yi yazdirir ve sagina bir bosluk koyar
                System.out.print(i + " ");
            }
            System.out.println("");


        }
    }


}