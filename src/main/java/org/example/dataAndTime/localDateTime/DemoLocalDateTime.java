package org.example.dataAndTime.localDateTime;

import java.time.*;

public class DemoLocalDateTime {
    public static void main(String[] args) {

        System.out.println("----------------LocalDate--------------------------");
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2022, 2, 1);
        System.out.println(ld);
        System.out.println(ld1);

        System.out.println("----------------LocalTime--------------------------");
        LocalTime lt = LocalTime.now();
        LocalTime lt1 = LocalTime.of(12, 44, 33);
        System.out.println(lt);
        System.out.println(lt1);

        System.out.println("----------------LocalDateTime--------------------------");
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022, 12, 11, 3, 34, 23);
        System.out.println(ldt);
        System.out.println(ldt2);

        System.out.println("------------------MonthDay------------------------");
        MonthDay md = MonthDay.of(7, 1);
        LocalDate newLocalDate = md.atYear(2022);
        System.out.println(md);
        System.out.println(newLocalDate);

        System.out.println("------------------YearMonth------------------------");
        YearMonth ym = YearMonth.now();
        LocalDate localDate = ym.atDay(22);
        System.out.println(ym);
        System.out.println(localDate);

    }
}
