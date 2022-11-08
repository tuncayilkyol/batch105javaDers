package ders27_immutableClasses_DateAndTime;
import java.time.LocalDate;
import java.time.Period;
public class C07_PeriodOf {
    public static void main(String[] args) {
        // dogumunuzdan bugune ne kadar zaman gecti ?
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1972,11,17);//P49Y11M12D
        Period gecenSure= Period.between(dogumGunu,bugun);
        System.out.println(gecenSure); // P50Y9M11D
        System.out.println(gecenSure.getYears()); // 49
    }
}