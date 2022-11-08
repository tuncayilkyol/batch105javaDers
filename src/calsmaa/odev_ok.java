package calsmaa;

public class odev_ok {
    public static void main(String[] args) {

        int sayi;
        int sum= 0;
        for ( sayi = 3; sayi >1 ; sayi=sayi/sayi)
            // susulu parantez yoktur, ilk noktali virgule kadar olan kisim loop body si olur
            sum+=sayi;            //sayi/=sayi++ once atama, sonra artirma
        // 1>1  false olur loop biter ve alta gecer
        System.out.println(sum); // 3
    }
}
