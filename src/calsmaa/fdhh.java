package calsmaa;

public class fdhh {

    public static void main(String[] args) {


/*
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
