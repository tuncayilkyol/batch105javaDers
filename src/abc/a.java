package abc;

class Array07 {
    static int n = 10;
    static int[] arr = new int[n];
    static void degerYaz(int[] p) {
        for (int i = 0; i < p.length; i++)
            p[i] = i;
    }static void degerOku(int[] r) {
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
    public static void main(String[] args) {
        degerYaz(arr);
        degerOku(arr);
    }
}

/*
          Çıktı:
          0
          1
          2
          3
          4
          5
          6
          7
          8
          9
    */