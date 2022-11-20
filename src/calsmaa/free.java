package calsmaa;

public class free {
    public static void main(String[] args) {

        try {

            çalış();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private static void çalış() {

        throw new RuntimeException("q");

    }
}
