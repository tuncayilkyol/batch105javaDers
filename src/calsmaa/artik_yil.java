package calsmaa;

public class artik_yil {
    public static void main(String[] args) {



        int ay = 2;

        int yil = 2020;

        int günSayisi = 0;



        switch (ay) {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:

                günSayisi = 31;

                break;

            case 4:

            case 6:

            case 9:

            case 11:

                günSayisi = 30;

                break;

            case 2:



                if ( ((yil % 4 == 0) && !(yil % 100 == 0))

                        || (yil % 400 == 0) )

                    günSayisi = 29;

                else

                    günSayisi = 28;

                break;

        }

        System.out.println("Seçilen ayın gün sayısı = " + günSayisi);

    }
}
