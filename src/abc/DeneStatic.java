package abc;

public class DeneStatic {
    static int a = 5;
    static int b;
    static void deneme(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static blok başlatıldı.");
        b = a * 3;
    }
    public static void main(String args[]) {

        deneme(37);     //x=37 a=5 b=15

    }

}
