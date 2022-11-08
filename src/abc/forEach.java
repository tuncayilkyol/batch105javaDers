package abc;

public class forEach {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 9, 16, 25};
        for (int i :arr){
        //for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " nin karesi: " + arr[i] + " dir");
            //  veya System.out.printf("%d nin karesi %d dir.\n",i, arr[i]);
        }
    }
}
/* çıktı

0 nin karesi: 0 dir
1 nin karesi: 1 dir
2 nin karesi: 4 dir
3 nin karesi: 9 dir
4 nin karesi: 1 6dir
5 nin karesi: 2 5dir

 */