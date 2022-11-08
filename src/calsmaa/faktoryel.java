package calsmaa;

import java.util.Scanner;

public class faktoryel {

    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tam sayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        System.out.print(sayi + "!" + "=");

        for (int i = sayi; i >= 1; i--) {
            faktoriyel = faktoriyel * i;
            if (i == 1) System.out.print(1);

            else System.out.print(i + "*");
        }
        System.out.print("=" + faktoriyel);
    }

}
