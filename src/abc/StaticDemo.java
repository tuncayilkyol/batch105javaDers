package abc;

public class StaticDemo {
    static int a = 26;
    static int b = 64;
    static void yaz() {
        System.out.println("a = " + a);
    }
}
class StaticYaz {
    public static void main(String args[]){
        StaticDemo.yaz();
        System.out.println("b = " + StaticDemo.b);  //a = 26
                                                    // b = 64


    }

}
/*


 */



