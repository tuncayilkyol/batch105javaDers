package ders11_sitringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {

        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli
        String input= "9%H2av*(a  co_k 1*guzel";
        input=input.replaceAll("\\d",""); // Ja+va cok *guzel
        input=input.replace(" ","5"); // Ja+va5cok5*guzel
        input=input.replaceAll("\\W","");// Java5cok5guzel
        //    \\w harf sayı ve _ değştirir mi. dene?
        input=input.replace("_","");
        input=input.replace("5"," "); // Java cok guzel
        input=input.replaceAll("\\s+"," ");
        System.out.println(input);

        /*
        replaceAll da char kullanılmaz
        input=input.replaceAll("H","m"); olur
        input=input.replaceAll('H','m'); olmazzzzz
         */
    }
}
