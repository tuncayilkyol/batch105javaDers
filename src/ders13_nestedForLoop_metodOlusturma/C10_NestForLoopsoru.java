package ders13_nestedForLoop_metodOlusturma;

public class C10_NestForLoopsoru {
    public static void main(String[] args) {

        /* soru:
              1
             2 2
            3 3 3
       */
        for (int i = 1; i <= 4; i++) {
            for (int j = i ; j <= i*2-1 ; ++j) {

                System.out.print(i + "");
            }

            System.out.println("");
        }
    }
}
