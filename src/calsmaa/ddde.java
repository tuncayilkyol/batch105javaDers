package calsmaa;

public class ddde {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);// string metodu olduğundan kalıcı olmaz

        sb1.deleteCharAt(3);

        sb1.reverse();

        System.out.println(sb1);//8PACO
    }
}
