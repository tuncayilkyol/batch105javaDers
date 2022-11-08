package calsmaa;

import java.util.Scanner;

public class forx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bugun gunlerden ne ?");
        String gun = scan.next();

        if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("simdi calisma zamani tatile 5 gun var");
        }
        if (gun.equalsIgnoreCase("sali")) {
            System.out.println("simdi calisma zamani tatile 4 gun var");
        }
        if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("simdi calisma zamani tatile 3 gun var");
        }
        if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("simdi calisma zamani tatile 2 gun var");
        }
        if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("simdi calisma zamani tatile 1 gun var");
        }
        if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("simdi dinlenme zamani");
        }
        if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("simdi dinlenme zamani");
        }

    }
}
